package com.danilodev.desafiocrud.repositories;
import com.danilodev.desafiocrud.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}