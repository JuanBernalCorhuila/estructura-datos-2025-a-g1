package Modelo;

public class Pajaro extends Animal{
    private String tipoDeCanto;

    public Pajaro(String nombre, int edad, double peso, String tipoDeCanto) {
        super(nombre, edad, peso);
        this.tipoDeCanto = tipoDeCanto;
    }

    public String getTipoDeCanto() {
        return tipoDeCanto;
    }
    public void setTipoDeCanto(String tipoDeCanto) {
        this.tipoDeCanto = tipoDeCanto;
    }

    @Override
    public void hacerSonido(){
        System.out.println("El pájaro canta una hermosa melodía");
    }

    public void volar(){
        System.out.println(getNombre()+" está volando por el campo");
    }
}