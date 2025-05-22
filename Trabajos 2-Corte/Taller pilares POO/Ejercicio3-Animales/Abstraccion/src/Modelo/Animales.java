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