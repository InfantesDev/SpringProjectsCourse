package com.app.form.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.app.form.models.domain.Usuario;

import jakarta.validation.Valid;

@Controller
public class FormController {
    
    @GetMapping("/form")
    public String form(Model model){
        Usuario usuario = new Usuario();
        usuario.setNombre("John");
        usuario.setApellido("Doe");
        usuario.setIdentificador("123.456.789-X");
        model.addAttribute("titulo", "Formulario usuarios");
        model.addAttribute("user", usuario);
        return "form";
    }

    @PostMapping("/form")
    public String procesar(@Valid @ModelAttribute("user") Usuario usuario, BindingResult result, Model model
        /*@RequestParam String username,
        @RequestParam String password,
        @RequestParam String email*/){

        /* 
        Usuario usuario = new Usuario();

        usuario.setUsername(username);
        usuario.setPassword(password);
        usuario.setEmail(email);
        */
        model.addAttribute("titulo", "Resultado form");

        if(result.hasErrors()){
            /*
            Map<String, String> errores = new HashMap<>();
            result.getFieldErrors().forEach(err->{
                errores.put(err.getField(), "El campo ".concat(err.getField()).concat(" ")
                    .concat(err.getDefaultMessage()));
            });
            model.addAttribute("error", errores);
            */  
            return "form";
        }

        model.addAttribute("usuario", usuario);

        return "resultado";
    }
}
