package com.example.prueba1.models.servicio;

//@Component("miServicioSimple")
public class MiServicio implements IServicio{
    @Override
    public String operacion() {
        return "se esta realizando una operacion simple..";
    }
}
