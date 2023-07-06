package com.example.prueba1.models.servicio;
import org.springframework.stereotype.Component;

//@Component("miServicioSimple")
public class MiServicio implements IServicio{
    @Override
    public String operacion() {
        return "se esta realizando una operacion simple..";
    }
}
