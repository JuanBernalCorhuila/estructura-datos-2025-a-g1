package Modelo;

public class Conejo extends Animal{
    private double longitudDeOrejas;

    public Conejo(String nombre, int edad, double peso, double longitudDeOrejas) {
        super(nombre, edad, peso);
        this.longitudDeOrejas = longitudDeOrejas;
    }

    public double getLongitudDeOrejas() {
        return longitudDeOrejas;
    }
    public void setLongitudDeOrejas(double longitudDeOrejas) {
        this.longitudDeOrejas = longitudDeOrejas;
    }

    @Override
    public void hacerSonido(){
        System.out.println("El conejo chilla mientras mueve los bigotes");
    }

    public void saltar(){
        System.out.println(getNombre()+" está saltando alto");
    }
}