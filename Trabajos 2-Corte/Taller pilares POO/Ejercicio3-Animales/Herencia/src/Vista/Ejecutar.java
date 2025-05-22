package Vista;
import Modelo.Animales;
import Modelo.Gato;
import Modelo.Mono;
import Modelo.Serpiente;

public class Ejecutar {
    public static void main(String[] args) {
//Mostrar datos
        System.out.println(" Probando Herencia");
        Animales perro = new Animales();
        perro.Ver();

        Gato gato = new Gato();
        gato.Ver();

        Mono mono = new Mono();
        mono.Ver();

        Serpiente serpiente = new Serpiente();
        serpiente.Ver();
    }
}
