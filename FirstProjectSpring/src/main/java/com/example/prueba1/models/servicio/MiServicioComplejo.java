package com.example.prueba1.models.servicio;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")
//@Primary
public class MiServicioComplejo implements IServicio{
    @Override
    public String operacion() {
        return "se esta realizando una operacion compleja..";
    }
}
