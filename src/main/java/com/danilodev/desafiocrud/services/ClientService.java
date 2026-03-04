package com.danilodev.desafiocrud.services;


import com.danilodev.desafiocrud.dto.ClientDTO;
import com.danilodev.desafiocrud.entities.Client;
import com.danilodev.desafiocrud.repositories.ClientRepository;
import com.danilodev.desafiocrud.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id) {
        Client client = repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Recurso não encontrado"));
        return new ClientDTO(client);
    }


}
