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