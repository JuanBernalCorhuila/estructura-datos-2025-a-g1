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
