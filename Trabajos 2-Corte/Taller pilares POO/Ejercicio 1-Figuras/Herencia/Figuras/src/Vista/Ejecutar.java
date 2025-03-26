package Vista;
import Modelo.Figura;
import Modelo.Circulo;
import Modelo.Cuadrado;
import Modelo.Rectangulo;

public class Ejecutar{
    public static void main (String[] Arg){
//Mostrar datos
        System.out.println("Probando escenario 1.");
        Figura triangulo = new Figura();
        triangulo.Mostrar();

        Circulo circulo = new Circulo();
        circulo.Mostrar();

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.Mostrar();

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.Mostrar();
    }
}