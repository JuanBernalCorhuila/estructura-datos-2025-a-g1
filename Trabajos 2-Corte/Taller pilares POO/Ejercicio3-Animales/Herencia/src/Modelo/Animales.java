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
