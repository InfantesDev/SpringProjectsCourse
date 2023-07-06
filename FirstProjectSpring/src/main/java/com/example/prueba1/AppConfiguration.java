package com.example.prueba1;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.prueba1.models.domain.ItemFactura;
import com.example.prueba1.models.domain.Producto;
import com.example.prueba1.models.servicio.IServicio;
import com.example.prueba1.models.servicio.MiServicio;
import com.example.prueba1.models.servicio.MiServicioComplejo;

@Configuration
public class AppConfiguration {

    @Bean("miServicioSimple")
    public IServicio registrarMiServicio(){
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    @Primary
    public IServicio registrarMiServicioComplejo(){
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems(){
        Producto producto1 = new Producto("Camara Rayum", 200);
        Producto producto2 = new Producto("Foco Rayum", 100);

        ItemFactura linea1 = new ItemFactura(producto1, 3);
        ItemFactura linea2 = new ItemFactura(producto2, 2);

        return Arrays.asList(linea1, linea2);
    }
}
