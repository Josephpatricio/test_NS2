package com.demo.repositories;

import com.demo.documents.Cliente;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClienteRepository extends MongoRepository <Cliente, String> {


    void delete(String id);
}
