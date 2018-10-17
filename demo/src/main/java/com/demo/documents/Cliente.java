package com.demo.documents;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cliente {

    @Id
    private String id;
    private String nome;
    private String email;
    private String cpf;

    public Cliente(){

    }

    public String getId() {
        return id;
    }

    @NotEmpty(message = "Nome não pode estar em branco.")
    public String getNome() {
        return nome;
    }

    @NotEmpty(message = "email não pode estar em branco.")
    @Email(message = "Email invalido.")
    public String getEmail() {
        return email;
    }

    @NotEmpty(message = "CPF não pode estar em branco.")
    @CPF(message = "CPF invalido.")
    public String getCpf() {
        return cpf;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
