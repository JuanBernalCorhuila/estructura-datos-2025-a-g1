package Vista;
import Modelo.Gato;
import Modelo.Mono;
import Modelo.Serpiente;

public class Ejecutar {
    public static void main(String[] args) {
//Mostrar datos
        System.out.println("Clase hija Gato");

        Gato gato = new Gato();
        gato.setNombre("Gato");
        gato.setHabitat("Terrestre");
        gato.setTipo("Vertebrado");
        gato.setPatas("Cuadrúpedo");
        gato.setAlimentacion("Carnívoro");
        gato.Ver();

        System.out.println("Clase hija Mono");

        Mono mono = new Mono();
        mono.setNombre("Mono");
        mono.setHabitat("Terrestre y arbóreo");
        mono.setTipo("Vertebrado");
        mono.setAlimentacion("Omnívoro");
        mono.setReproduccion("Mamífero");
        mono.Ver();

        System.out.println("Clase hija Serpiente");

        Serpiente serpiente = new Serpiente();
        serpiente.setNombre("Serpiente");
        serpiente.setSonido("siseo");
        serpiente.setHabitat("Terrestre o acuático ");
        serpiente.setTipo("Vertebrado");
        serpiente.setAlimentacion("Carnívoro");
        serpiente.Ver();
    }
}
