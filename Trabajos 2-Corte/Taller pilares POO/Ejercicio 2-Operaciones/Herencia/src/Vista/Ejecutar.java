package Vista;
import Modelo.Operaciones;
import Modelo.Resta;
import Modelo.Multiplicacion;
import Modelo.Division;

public class Ejecutar {
    public static void main(String[] args) {
//Mostrar datos
        System.out.println(" Probando Herencia");
        Operaciones suma = new Operaciones();
        suma.Visualizar();

        Resta resta = new Resta();
        resta.Visualizar();

        Multiplicacion multiplicacion = new Multiplicacion();
        multiplicacion.Visualizar();

        Division division = new Division();
        division.Visualizar();
    }
}
