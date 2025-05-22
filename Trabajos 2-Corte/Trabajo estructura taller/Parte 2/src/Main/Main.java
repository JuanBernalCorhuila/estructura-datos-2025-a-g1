package Main;

import Modelo.Cliente;
import Modelo.Empleado;
import Service.PersonaService;

public class Main {
    public static void main(String[] args){
        PersonaService service = new PersonaService();

        service.agregarPersona(new Cliente("Néstor", 24, "Calle 3 #7-90", 31, "PS5, Nintendo Switch, TV LG, Licuadora"));
        service.agregarPersona(new Empleado("Carla", 20, "Carrera 1 #4-21", "200001132", "Supervisor", 2000000));

        service.mostrarDatos();
    }
}
