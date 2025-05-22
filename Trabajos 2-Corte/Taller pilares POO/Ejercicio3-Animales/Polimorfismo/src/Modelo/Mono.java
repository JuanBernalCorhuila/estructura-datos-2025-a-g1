package Modelo;

public class Mono extends Animales{

    @Override
    public void Ver(){
        System.out.println("Nombre de este fabuloso animal: "+this.getNombre()+"\n" +
                "El hábitat de este animal es: "+this.getHabitat()+"-->selvas y bosques tropicales"+"\n"+
                "Es "+this.getTipo()+" y es "+this.getAlimentacion()+"\n");
    }
}
