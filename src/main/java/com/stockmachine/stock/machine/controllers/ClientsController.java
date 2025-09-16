package com.stockmachine.stock.machine.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientsController {
    @GetMapping("/clientes")
    public String index(){
        return "clients/index";
    }
}