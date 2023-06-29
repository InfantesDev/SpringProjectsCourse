package com.example.demo.models.servicio;

import org.springframework.stereotype.Component;

@Component("miSuperServicio")
public class MiServicio implements IServicio{
    @Override
    public String operacion() {
        return "se esta realizando una operacion..";
    }
}
