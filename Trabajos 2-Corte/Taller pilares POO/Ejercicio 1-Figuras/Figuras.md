# EJERCICIO 1-FIGURAS

Este archivo lleva la estructura de los 4 pilares en POO aplicados a un ejercicio de Figuras, esto con el fin de ser más claro al momento de presentar el ejercicio, este md solo lleva la estructura del ejercicio 1, los demás están en su respectiva carpeta

# 1. Herencia

### Figura

```java
package Modelo;

public class Figura{
    private String nombre;
    private String formula;
    private double area;
    private double base;
    private double altura;

    //Implementación del método
    public void Mostrar(){
        this.nombre = "Triángulo";
        this.formula = "(Base*altura)/2";
        this.base = 2;
        this.altura = 8;
        this.area = (base*altura)/2;
        System.out.println("Nombre de la figura: "+this.nombre+"\n" +
                        "Fórmula del área: "+this.formula+"\n"+
                        "Base: "+this.base+"\n"+
                        "Altura: "+this.altura+"\n"+
                        "Área = "+this.area+"\n");
    }
}

```
### Circulo
```java
package Modelo;

public class Circulo extends Figura{

}
```
### Cuadrado
```java
package Modelo;

public class Cuadrado extends Figura{

}
```
### Rectangulo
```java
package Modelo;

public class Rectangulo extends Figura {

}
```
### Ejecutar
```java
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
```
# 2. Encapsulamiento

### Figura

```java
package Modelo;

public class Figura{
    private String nombre;
    private String formula;
    private double area;
    private double base;
    private double altura;

    //Set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFormula(String formula){
        this.formula = formula;
    }
    public void setArea(double area){
        this.area = area;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    //Get
    public String getNombre(){
        return this.nombre;
    }
    public String getFormula(){
        return this.formula;
    }
    public double getArea(){
        return this.area;
    }
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    //Implementación del método
    public void Mostrar(){
        System.out.println("Nombre de la figura: "+this.getNombre()+"\n" +
                        "Fórmula del área: "+this.getFormula()+"\n"+
                        "Base: "+this.getBase()+"\n" +
                        "Altura: "+this.getAltura()+"\n"+
                        "Área: "+this.getArea()+"\n"
                        );
    }
    public void Mostrar2(){
        System.out.println("Nombre de la figura: "+this.getNombre()+"\n" +
                "Fórmula del área: "+this.getFormula()+"\n"+
                "Radio: "+this.getBase()+"\n"+
                "Área: "+this.getArea()+"\n"
        );
    }
}
```
### Circulo
```java
package Modelo;

public class Circulo extends Figura{

}
```
### Cuadrado
```java
package Modelo;

public class Cuadrado extends Figura{

}
```
### Rectangulo
```java
package Modelo;

public class Rectangulo extends Figura {

}
```
### Ejecutar
```java
package Vista;
import Modelo.Figura;
import Modelo.Circulo;
import Modelo.Cuadrado;
import Modelo.Rectangulo;
import java.util.Scanner;

public class Ejecutar{
    public static void main (String[] Arg){
        Scanner leer = new Scanner(System.in);

//Mostrar datos
        System.out.println("Clase Padre");

        Figura triangulo = new Figura();
        triangulo.setNombre("Triángulo");
        triangulo.setFormula("(Base*altura)/2");
        System.out.println("Ingrese la base del triángulo:");
        double baseTriangulo = leer.nextDouble();
        triangulo.setBase(baseTriangulo);
        System.out.println("Ingrese la altura del triángulo:");
        double alturaTriangulo = leer.nextDouble();
        triangulo.setAltura(alturaTriangulo);
        double areaTriangulo = ((baseTriangulo*alturaTriangulo)/2);
        triangulo.setArea(areaTriangulo);
        triangulo.Mostrar();

        System.out.println("Clase Hija Círculo");

        Circulo circulo = new Circulo();
        circulo.setNombre("Circulo");
        circulo.setFormula("π * r²");
        System.out.println("Ingrese el radio del circulo:");
        double radioCirculo = leer.nextDouble();
        circulo.setBase(radioCirculo);
        double areaCirculo = Math.PI*(radioCirculo*radioCirculo);
        circulo.setArea(areaCirculo);
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
        cuadrado.Mostrar();

        System.out.println("Clase Hija Rectángulo");

        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setNombre("Rectángulo");
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
```
# 3. Polimorfismo

### Figura

```java
package Modelo;

public class Figura{
    private String nombre;
    private String formula;
    private double area;
    private double base;
    private double altura;

    //Set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFormula(String formula){
        this.formula = formula;
    }
    public void setArea(double area){
        this.area = area;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    //Get
    public String getNombre(){
        return this.nombre;
    }
    public String getFormula(){
        return this.formula;
    }
    public double getArea(){
        return this.area;
    }
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    //Implementación del método
    public void Mostrar(){
        System.out.println("Nombre de la figura: "+this.getNombre()+"\n" +
                "Fórmula del área: "+this.getFormula()+"\n"+
                "Base: "+this.getBase()+"\n" +
                "Altura: "+this.getAltura()+"\n"+
                "Área: "+this.getArea()+"\n"
        );
    }
    public void Mostrar2(){
        System.out.println("Nombre de la figura: "+this.getNombre()+"\n" +
                "Fórmula del área: "+this.getFormula()+"\n"+
                "Radio: "+this.getBase()+"\n"+
                "Área: "+this.getArea()+"\n"
        );
    }
}
```
### Circulo
```java
package Modelo;

public class Circulo extends Figura{
    @Override
    public void Mostrar2(){
        System.out.println("La figura se llama: "+this.getNombre()+"\n" +
                "Su area se calcula mediante la fórmula: "+this.getFormula()+"\n"+
                "El radio que digitó es: "+this.getBase()+"\n"+
                "El área ya calculada es: "+this.getArea()+"\n"
        );
    }
}
```
### Cuadrado
```java
package Modelo;

public class Cuadrado extends Figura{
    @Override
    public void Mostrar(){
        System.out.println("La figura es: "+this.getNombre()+". Su área se calcula con la fórmula: "+this.getFormula()+"\n"+
                "Como la base y la altura son iguales: "+"\n"+
                "Su base es:"+this.getBase()+"\n" +
                "Y su altura: "+this.getAltura()+"\n"+
                "El área en ese orden de ideas es: "+this.getArea()+"\n"
        );
    }
}
```
### Rectangulo
```java
package Modelo;

public class Rectangulo extends Figura {
    @Override
    public void Mostrar(){
        System.out.println("La figura se conoce como: "+this.getNombre()+"\n"+
                "Es familiar al cuadrado pero este tiene dos pares de lados iguales"+
                "\nSu fórmula es: "+this.getFormula()+"\n"+
                "La base que digitaste fue: "+this.getBase()+"\n"+
                "La altura que digitaste fue: "+this.getAltura()+"\n" +
                "Su área se ha calculado y es: "+this.getArea()+"\n"
        );
    }
}
```
### Ejecutar
```java
package Vista;
import Modelo.Figura;
import Modelo.Circulo;
import Modelo.Cuadrado;
import Modelo.Rectangulo;
import java.util.Scanner;

public class Ejecutar{
    public static void main (String[] Arg){
        Scanner leer = new Scanner(System.in);

//Mostrar datos
        System.out.println("Clase Padre");
        
        Figura triangulo = new Figura();
        triangulo.setNombre("Triángulo");
        triangulo.setFormula("(Base*altura)/2");
        System.out.println("Ingrese la base del triángulo:");
        double baseTriangulo = leer.nextDouble();
        triangulo.setBase(baseTriangulo);
        System.out.println("Ingrese la altura del triángulo:");
        double alturaTriangulo = leer.nextDouble();
        triangulo.setAltura(alturaTriangulo);
        double areaTriangulo = ((baseTriangulo*alturaTriangulo)/2);
        triangulo.setArea(areaTriangulo);
        triangulo.Mostrar();

        System.out.println("Clase Hija Círculo");

        Circulo circulo = new Circulo();
        circulo.setNombre("Circulo");
        circulo.setFormula("π * r²");
        System.out.println("Ingrese el radio del circulo:");
        double radioCirculo = leer.nextDouble();
        circulo.setBase(radioCirculo);
        double areaCirculo = Math.PI*(radioCirculo*radioCirculo);
        circulo.setArea(areaCirculo);
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
        cuadrado.Mostrar();

        System.out.println("Clase Hija Rectángulo");
        
        Rectangulo rectangulo = new Rectangulo();
        rectangulo.setNombre("Rectángulo");
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
```
# 4.Abstracción

### Figura

```java
package Modelo;

public abstract class Figura{
    private String nombre;
    private String formula;
    private double area;
    private double base;
    private double altura;

    //Set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFormula(String formula){
        this.formula = formula;
    }
    public void setArea(double area){
        this.area = area;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    //Get
    public String getNombre(){
        return this.nombre;
    }
    public String getFormula(){
        return this.formula;
    }
    public double getArea(){
        return this.area;
    }
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    //Implementación del método
    public void Mostrar(){
        System.out.println("Nombre de la figura: "+this.getNombre()+"\n" +
                "Fórmula del área: "+this.getFormula()+"\n"+
                "Base: "+this.getBase()+"\n" +
                "Altura: "+this.getAltura()+"\n"+
                "Área: "+this.getArea()+"\n"
        );
    }
    public void Mostrar2(){
        System.out.println("Nombre de la figura: "+this.getNombre()+"\n" +
                "Fórmula del área: "+this.getFormula()+"\n"+
                "Radio: "+this.getBase()+"\n"+
                "Área: "+this.getArea()+"\n"
        );
    }
}
```
### Circulo
```java
package Modelo;

public class Circulo extends Figura{
    private String caracteristica;

    public String getCaracteristica(){
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica){
        this.caracteristica = caracteristica;
    }

    @Override
    public void Mostrar2(){
        System.out.println("La figura se llama: "+this.getNombre()+"\n" +
                "Su area se calcula mediante la fórmula: "+this.getFormula()+"\n"+
                "El radio que digitó es: "+this.getBase()+"\n"+
                "El área ya calculada es: "+this.getArea()+"\n"+
                "Su nombre de circulo se debe por su característica de ser "+this.getCaracteristica()+"\n"
        );
    }
}
```
### Cuadrado
```java
package Modelo;

public class Cuadrado extends Figura{
    private int lados;

    public int getLados(){
        return lados;
    }

    public void setLados(int lados){
        this.lados = lados;
    }

    @Override
    public void Mostrar(){
        System.out.println("La figura es: "+this.getNombre()+". Su área se calcula con la fórmula: "+this.getFormula()+"\n"+
                "Como la base y la altura son iguales: "+"\n"+
                "Su base es:"+this.getBase()+"\n" +
                "Y su altura: "+this.getAltura()+"\n"+
                "El área en ese orden de ideas es: "+this.getArea()+"\n"+
                "Como dato extra, el número de lados de un cuadrado es: "+this.getLados()+"\n"
        );
    }
}

```
### Rectangulo
```java
package Modelo;

public class Rectangulo extends Figura {
    private String tipo;

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public void Mostrar(){
        System.out.println("La figura se conoce como: "+this.getNombre()+"\n"+"\n"+
                "Es familiar al cuadrado pero este tiene dos pares de lados iguales"+
                "\nComo dato extra, se le conoce como "+this.getTipo()+"\n"+
                "\nSu fórmula es: "+this.getFormula()+"\n"+
                "La base que digitaste fue: "+this.getBase()+"\n"+
                "La altura que digitaste fue: "+this.getAltura()+"\n" +
                "Su área se ha calculado y es: "+this.getArea()+"\n"
        );
    }
}
```
### Ejecutar
```java
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
```