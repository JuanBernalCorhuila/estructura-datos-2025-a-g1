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