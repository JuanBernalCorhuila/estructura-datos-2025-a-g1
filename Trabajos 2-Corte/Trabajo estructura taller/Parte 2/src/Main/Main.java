package Main;

import Modelo.Cliente;
import Modelo.Empleado;
import Service.PersonaService;

public class Main {
    public static void main(String[] args){
        PersonaService service = new PersonaService();

        service.agregarAnimal(new Cliente("Firulais", 4, 12.5f, "Labrador"));
        service.agregarAnimal(new Gato("Michi", 3, 4.2f, true));
        service.agregarAnimal(new Burro("Tito", 10, 100.0f, "Gis"));
        service.agregarAnimal(new Empleado("Nemo", 1, 0.3f, "Agua salada"));

        service.mostrarAcciones();
    }
}
