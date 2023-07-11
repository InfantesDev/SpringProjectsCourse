package com.example.prueba1.models.servicio;
//@Component("miServicioComplejo")
//@Primary
public class MiServicioComplejo implements IServicio{
    @Override
    public String operacion() {
        return "se esta realizando una operacion compleja..";
    }
}
