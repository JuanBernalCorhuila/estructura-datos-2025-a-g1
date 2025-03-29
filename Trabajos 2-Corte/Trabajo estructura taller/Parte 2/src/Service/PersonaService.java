package Service;
import Modelo.Persona;

import java.util.ArrayList;
import java.util.List;

public class PersonaService {
    private List<Persona> animales = new ArrayList<>();

    public void agregarAnimal(Persona animal){
        animales.add(animal);
    }

    public void mostrarAcciones(){
        for (Persona a : animales){
            System.out.println("Nombre: "+ a.getNombre());
            a.comer();
            a.dormir();
            a.desplazarse();
            System.out.println();
        }
    }
}
