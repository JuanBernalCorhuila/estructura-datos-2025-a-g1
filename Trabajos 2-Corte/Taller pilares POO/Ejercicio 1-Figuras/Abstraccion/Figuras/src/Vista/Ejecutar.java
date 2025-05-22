package Vista;

import Modelo.Circulo;
import Modelo.Cuadrado;
import Modelo.Rectangulo;
import java.util.Scanner;

public class Ejecutar{
    public static void main (String[] Arg){
        Scanner leer = new Scanner(System.in);

//Mostrar datos
        System.out.println("Clase Hija Círculo");

        Circulo circulo = new Circulo();
        circulo.setNombre("Circulo");
        circulo.setFormula("π * r²");
        System.out.println("Ingrese el radio del circulo:");
        double radioCirculo = leer.nextDouble();
        circulo.setBase(radioCirculo);
        double areaCirculo = Math.PI*(radioCirculo*radioCirculo);
        circulo.setArea(areaCirculo);
        circulo.setCaracteristica("Redondo");
        circulo.Mostrar2();

        System.out.println("Clase Hija Cuadrado");

        Cuadrado cuadrado = new Cuadrado();
        cuadrado.setNombre("Cuadrado");
        cuadrado.setFormula("Lado*Lado");
        System.out.println("Ingrese el lado del cuadrado:");
        double ladoCuadrado = leer.nextDouble();
        cuadrado.setBase(ladoCuadrado);
        cuadrado.setAltura(ladoCuadrado);
        double areaCuadrado = ladoCuadrado*ladoCuadrado;
        cuadrado.setArea(areaCuadrado);
        cuadrado.setLados(4);
        cuadrado.Mostrar();

        System.out.println("Clase Hija Rectángulo");

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setNombre("Rectángulo");
        rectangulo.setTipo("Paralelogramo");
        rectangulo.setFormula("Base*altura");
        System.out.println("Ingrese la base del rectángulo:");
        double baseRectangulo = leer.nextDouble();
        rectangulo.setBase(baseRectangulo);
        System.out.println("Ingrese la altura del rectángulo:");
        double alturaRectangulo = leer.nextDouble();
        rectangulo.setAltura(alturaRectangulo);
        double areaRectangulo = baseRectangulo*alturaRectangulo;
        rectangulo.setArea(areaRectangulo);
        rectangulo.Mostrar();
    }
}