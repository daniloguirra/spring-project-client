package com.danilodev.desafiocrud.dto;

import com.danilodev.desafiocrud.entities.Client;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.PositiveOrZero;

import java.time.LocalDate;

public class ClientDTO {


    private Long id;

    @NotBlank(message = "Campo 'name' requerido")
    private String name;
    private String cpf;
    private Double income;

    @PastOrPresent(message = "Nascimento não pode ser data futura")
    private LocalDate birthDate;
    @PositiveOrZero(message = "número de filhos maior ou igual a zero")
    private Integer children;

    public ClientDTO(){
    }

    public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {
        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClientDTO(Client entity) {
        id = entity.getId();
        name = entity.getName();
        income = entity.getIncome();
        cpf = entity.getCpf();
        birthDate = entity.getBirthDate();
        children = entity.getChildren();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public Double getIncome() {
        return income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getChildren() {
        return children;
    }
}
