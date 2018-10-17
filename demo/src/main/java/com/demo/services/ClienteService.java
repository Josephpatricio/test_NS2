package com.demo.services;

import com.demo.documents.Cliente;

import java.util.List;
import java.util.Optional;

public interface ClienteService {

    List<Cliente> listarTodos();

    Optional<Cliente> listarPorId(String id);

    Cliente cadastrar(Cliente cliente);

    Cliente atualizar(Cliente cliente);

    void remover(String id);
}
