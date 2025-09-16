package com.stockmachine.stock.machine.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ServicesController {
    @GetMapping("/servicos")
    public String index(){
        return "services/index";
    }
}
