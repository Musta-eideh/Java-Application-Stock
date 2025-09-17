package com.stockmachine.stock.machine.repository;

import org.springframework.data.repository.CrudRepository;

import com.stockmachine.stock.machine.model.Client;

public interface ClientsRepo extends CrudRepository<Client, Integer> {
    
}
