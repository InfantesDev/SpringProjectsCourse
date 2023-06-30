package main.java.com.example.prueba1.models.servicio;
import org.springframework.stereotype.Component;

@Component("miServicioSimple")
@Primary
public class MiServicioComplejo implements IServicio{
    @Override
    public String operacion() {
        return "se esta realizando una operacion compleja..";
    }
}
