package com.reto2.reto2.interfaz;

import com.reto2.reto2.modelo.Accesory;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InterfaceFootwear extends MongoRepository<Accesory, String>{
    
}
