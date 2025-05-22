# EJERCICIO 3-ANIMALES

Este archivo lleva la estructura de los 4 pilares en POO aplicados a un ejercicio de Animales, esto con el fin de ser más claro al momento de presentar el ejercicio, este md solo lleva la estructura del ejercicio 3, los demás están en su respectiva carpeta

# 1. Herencia

### Animales

```java
package Modelo;

public class Animales {
    private String nombre;
    private String habitat;
    private String tipo;
    private String alimentacion;

    //Implementación del método
    public void Ver(){
        this.nombre = "Perro";
        this.habitat = "Terrestre";
        this.tipo = "Vertebrado";
        this.alimentacion = "Omnívoro";
        System.out.println("Nombre del animal: "+this.nombre+"\n" +
                "Hábitat del animal: "+this.habitat+"\n"+
                "Tipo: "+this.tipo+"\n"+
                "Alimentación: "+this.alimentacion+"\n");
    }
}
```
### Gato
```java
package Modelo;

public class Gato extends Animales{

}
```
### Mono
```java
package Modelo;

public class Mono extends Animales{

}
```
### Serpiente
```java
package Modelo;

public class Serpiente extends Animales{

}
```
### Ejecutar
```java
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
```
# 2. Encapsulamiento

### Animales

```java
package Modelo;

public class Animales {
    private String nombre;
    private String habitat;
    private String tipo;
    private String alimentacion;


    //Set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setAlimentacion(String alimentacion){
        this.alimentacion = alimentacion;
    }

    //Get
    public String getNombre(){
        return this.nombre;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getAlimentacion(){
        return this.alimentacion;
    }

    //Implementación del método
    public void Ver(){
        System.out.println("Nombre del animal: "+this.getNombre()+"\n" +
                "Hábitat del animal: "+this.getHabitat()+"\n"+
                "Tipo: "+this.getTipo()+"\n"+
                "Alimentación: "+this.getAlimentacion()+"\n");
    }
}
```
### Gato
```java
package Modelo;

public class Gato extends Animales{

}
```
### Mono
```java
package Modelo;

public class Mono extends Animales{

}
```
### Serpiente
```java
package Modelo;

public class Serpiente extends Animales{

}
```
### Ejecutar
```java
package Vista;
import Modelo.Animales;
import Modelo.Gato;
import Modelo.Mono;
import Modelo.Serpiente;

public class Ejecutar {
    public static void main(String[] args) {
//Mostrar datos
        System.out.println("Clase Padre Animales");

        Animales perro = new Animales();
        perro.setNombre("Perro");
        perro.setHabitat("Terrestre");
        perro.setTipo("Vertebrado");
        perro.setAlimentacion("Omnívoro");
        perro.Ver();

        System.out.println("Clase hija Gato");

        Gato gato = new Gato();
        gato.setNombre("Gato");
        gato.setHabitat("Terrestre");
        gato.setTipo("Vertebrado");
        gato.setAlimentacion("Carnívoro");
        gato.Ver();

        System.out.println("Clase hija Mono");

        Mono mono = new Mono();
        mono.setNombre("Mono");
        mono.setHabitat("Terrestre y arbóreo");
        mono.setTipo("Vertebrado");
        mono.setAlimentacion("Omnívoro");
        mono.Ver();

        System.out.println("Clase hija Serpiente");

        Serpiente serpiente = new Serpiente();
        serpiente.setNombre("Serpiente");
        serpiente.setHabitat("Terrestre o acuático ");
        serpiente.setTipo("Vertebrado");
        serpiente.setAlimentacion("Carnívoro");
        serpiente.Ver();
    }
}
```
# 3. Polimorfismo

### Animales

```java
package Modelo;

public class Animales {
    private String nombre;
    private String habitat;
    private String tipo;
    private String alimentacion;


    //Set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setAlimentacion(String alimentacion){
        this.alimentacion = alimentacion;
    }

    //Get
    public String getNombre(){
        return this.nombre;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getAlimentacion(){
        return this.alimentacion;
    }

    //Implementación del método
    public void Ver(){
        System.out.println("Nombre del animal: "+this.getNombre()+"\n" +
                "Hábitat del animal: "+this.getHabitat()+"\n"+
                "Tipo: "+this.getTipo()+"\n"+
                "Alimentación: "+this.getAlimentacion()+"\n");
    }
}
```
### Gato
```java
package Modelo;

public class Gato extends Animales{

    @Override
    public void Ver(){
        System.out.println("Este animal es: ||"+this.getNombre()+"||"+"\n" +
                "El gato es un animal: "+this.getHabitat()+"\n"+
                "Tipo: "+this.getTipo()+"(porque tiene esqueleto)"+"\n"+
                "Alimentación: "+this.getAlimentacion()+"\n");
    }

}
```
### Mono
```java
package Modelo;

public class Mono extends Animales{

    @Override
    public void Ver(){
        System.out.println("Nombre de este fabuloso animal: "+this.getNombre()+"\n" +
                "El hábitat de este animal es: "+this.getHabitat()+"-->selvas y bosques tropicales"+"\n"+
                "Es "+this.getTipo()+" y es "+this.getAlimentacion()+"\n");
    }
}
```
### Serpiente
```java
package Modelo;

public class Serpiente extends Animales{

    @Override
    public void Ver(){
        System.out.println("La "+this.getNombre()+" es un animal que no posee patas" +"\n"+
                "Hábitat----> "+this.getHabitat()+"\n"+
                "Tipo: "+this.getTipo()+"\n"+
                "Alimentación: es "+this.getAlimentacion()+"\n");
    }
}
```
### Ejecutar
```java
package Vista;
import Modelo.Animales;
import Modelo.Gato;
import Modelo.Mono;
import Modelo.Serpiente;

public class Ejecutar {
    public static void main(String[] args) {
//Mostrar datos
        System.out.println("Clase Padre Animales");

        Animales perro = new Animales();
        perro.setNombre("Perro");
        perro.setHabitat("Terrestre");
        perro.setTipo("Vertebrado");
        perro.setAlimentacion("Omnívoro");
        perro.Ver();

        System.out.println("Clase hija Gato");

        Gato gato = new Gato();
        gato.setNombre("Gato");
        gato.setHabitat("Terrestre");
        gato.setTipo("Vertebrado");
        gato.setAlimentacion("Carnívoro");
        gato.Ver();

        System.out.println("Clase hija Mono");

        Mono mono = new Mono();
        mono.setNombre("Mono");
        mono.setHabitat("Terrestre y arbóreo");
        mono.setTipo("Vertebrado");
        mono.setAlimentacion("Omnívoro");
        mono.Ver();

        System.out.println("Clase hija Serpiente");

        Serpiente serpiente = new Serpiente();
        serpiente.setNombre("Serpiente");
        serpiente.setHabitat("Terrestre o acuático ");
        serpiente.setTipo("Vertebrado");
        serpiente.setAlimentacion("Carnívoro");
        serpiente.Ver();
    }
}
```
# 4.Abstracción

### Animales

```java
package Modelo;

public abstract class Animales {
    private String nombre;
    private String habitat;
    private String tipo;
    private String alimentacion;


    //Set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public void setAlimentacion(String alimentacion){
        this.alimentacion = alimentacion;
    }

    //Get
    public String getNombre(){
        return this.nombre;
    }
    public String getHabitat(){
        return this.habitat;
    }
    public String getTipo(){
        return this.tipo;
    }
    public String getAlimentacion(){
        return this.alimentacion;
    }

    //Implementación del método
    public void Ver(){
        System.out.println("Nombre del animal: "+this.getNombre()+"\n" +
                "Hábitat del animal: "+this.getHabitat()+"\n"+
                "Tipo: "+this.getTipo()+"\n"+
                "Alimentación: "+this.getAlimentacion()+"\n");
    }
}
```
### Gato
```java
package Modelo;

public class Gato extends Animales{
    private String patas;

    public String getPatas(){
        return patas;
    }

    public void setPatas(String patas){
        this.patas = patas;
    }

    @Override
    public void Ver(){
        System.out.println("Este animal es: ||"+this.getNombre()+"||"+"\n" +
                "El gato es un animal: "+this.getHabitat()+"\n"+
                "Tipo: "+this.getTipo()+"(porque tiene esqueleto)"+"\n"+
                "Es un animal: "+this.getPatas()+"(porque tiene 4 patas)"+"\n"+
                "Alimentación: "+this.getAlimentacion()+"\n");
    }
}
```
### Mono
```java
package Modelo;

public class Mono extends Animales{
    private String reproduccion;

    public String getReproduccion(){
        return reproduccion;
    }

    public void setReproduccion(String reproduccion){
        this.reproduccion = reproduccion;
    }

    @Override
    public void Ver(){
        System.out.println("Nombre de este fabuloso animal: "+this.getNombre()+"\n" +
                "El hábitat de este animal es: "+this.getHabitat()+"-->selvas y bosques tropicales"+"\n"+
                "Es "+this.getTipo()+" y es "+this.getAlimentacion()+"\n"+
                "El mono es un animal "+this.getReproduccion()+" porque no pone huevos"+"\n");
    }
}
```
### Serpiente
```java
package Modelo;

public class Serpiente extends Animales{
    private String sonido;

    public String getSonido(){
        return sonido;
    }

    public void setSonido(String sonido){
        this.sonido = sonido;
    }

    @Override
    public void Ver(){
        System.out.println("La "+this.getNombre()+" es un animal que no posee patas" +"\n"+"\n"+
                "Sabías que el sonido que produce la serpiente se llama "+getSonido()+"?"+"\n"+
                "\nHábitat----> "+this.getHabitat()+"\n"+
                "Tipo: "+this.getTipo()+"\n"+
                "Alimentación: es "+this.getAlimentacion()+"\n");
    }
}

```
### Ejecutar
```java
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

```