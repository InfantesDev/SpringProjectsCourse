package com.example.demo.controllers;

import com.example.demo.models.servicio.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/*
    cuando agregamos constructor con params la dependencia ya se agrega si esta como componente o controlada por spring
    No haria falta el autowired
 */
@Controller
public class IndexController {
    @Autowired
    IServicio servicio;
    @GetMapping({"/", "", "/index"})
    public String index(Model model){
        model.addAttribute("objeto", servicio.operacion());
        return "index";
    }
}
