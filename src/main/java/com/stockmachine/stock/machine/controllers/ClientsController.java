package com.stockmachine.stock.machine.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.stockmachine.stock.machine.model.Client;
import com.stockmachine.stock.machine.repository.ClientsRepo;

@Controller
public class ClientsController {

    @Autowired
    private ClientsRepo clientRepo;

    @GetMapping("/clientes")
    public String index(Model model){
        List<Client> clients = (List<Client>)clientRepo.findAll();
        model.addAttribute("clients", clients);
        return "clients/index";
    }
}