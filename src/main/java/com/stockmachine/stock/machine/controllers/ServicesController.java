package com.stockmachine.stock.machine.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.stockmachine.stock.machine.model.Service;
import com.stockmachine.stock.machine.repository.ServiceRepo;

@Controller
public class ServicesController {

    @Autowired
    private ServiceRepo serviceRepo;

    @GetMapping("/servicos")
    public String index(Model model){
        List<Service> services = (List<Service>)serviceRepo.findAll();
        model.addAttribute("services", services);
        return "services/index";
    }

    @GetMapping("/servicos/novo")
    public String newService(){
        return "services/novo";
    }

}
