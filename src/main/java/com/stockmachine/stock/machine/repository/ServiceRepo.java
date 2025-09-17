package com.stockmachine.stock.machine.repository;

import org.springframework.data.repository.CrudRepository;

import com.stockmachine.stock.machine.model.Service;

public interface ServiceRepo extends CrudRepository<Service, Integer> {
    
}
