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
