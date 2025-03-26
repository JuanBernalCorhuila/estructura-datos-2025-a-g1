package Vista;
import Modelo.Operaciones;
import Modelo.Resta;
import Modelo.Multiplicacion;
import Modelo.Division;

import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
//Mostrar datos
        System.out.println("Clase Padre");

        Operaciones suma = new Operaciones();
        suma.setNombre("Suma");
        suma.setOperador("+");
        System.out.println("Son dos números para hacer la operación"+
                "\nIngrese el primero: ");
        double num1Suma = leer.nextDouble();
        suma.setNum1(num1Suma);
        System.out.println("Ingrese el segundo número");
        double num2Suma = leer.nextDouble();
        suma.setNum2(num2Suma);
        suma.setResultado(num1Suma+num2Suma);
        suma.Visualizar();

        System.out.println("Clase Hija Resta");

        Resta resta = new Resta();
        resta.setNombre("Resta");
        resta.setOperador("-");
        System.out.println("Son dos números para hacer la operación"+
                "\nIngrese el primero: ");
        double num1Resta = leer.nextDouble();
        resta.setNum1(num1Resta);
        System.out.println("Ingrese el segundo número");
        double num2Resta = leer.nextDouble();
        resta.setNum2(num2Resta);
        resta.setResultado(num1Resta-(num2Resta));
        resta.Visualizar();

        System.out.println("Clase Hija Multiplicación");

        Multiplicacion multiplicacion = new Multiplicacion();
        multiplicacion.setNombre("Multiplicación");
        multiplicacion.setOperador("*");
        System.out.println("Son dos números para hacer la operación"+
                "\nIngrese el primero: ");
        double num1Multiplicacion = leer.nextDouble();
        multiplicacion.setNum1(num1Multiplicacion);
        System.out.println("Ingrese el segundo número");
        double num2Multiplicacion = leer.nextDouble();
        multiplicacion.setNum2(num2Multiplicacion);
        multiplicacion.setResultado(num1Multiplicacion*num2Multiplicacion);
        multiplicacion.Visualizar();

        System.out.println("Clase Hija Division");

        Division division = new Division();
        division.setNombre("División");
        division.setOperador("/");
        System.out.println("Son dos números para hacer la operación"+
                "\nIngrese el primero: ");
        double num1Division = leer.nextDouble();
        division.setNum1(num1Division);
        System.out.println("Ingrese el segundo número (debe ser mayor a 0)");
        double num2Division = leer.nextDouble();
        division.setNum2(num2Division);
        division.setResultado(num1Division/num2Division);
        division.Visualizar();
    }
}