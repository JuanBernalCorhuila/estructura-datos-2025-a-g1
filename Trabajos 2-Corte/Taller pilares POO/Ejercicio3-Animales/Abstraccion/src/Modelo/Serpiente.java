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
