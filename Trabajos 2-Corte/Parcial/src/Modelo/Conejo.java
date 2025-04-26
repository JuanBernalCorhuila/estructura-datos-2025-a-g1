package Modelo;

public class Conejo extends Animal{
    private double longitudOrejas;

    //Método constructor
    public Conejo(String nombre, int edad, double peso, double longitudOrejas) {
        super(nombre, edad, peso);
        this.longitudOrejas = longitudOrejas;
    }

    //Get y set
    public double getLongitudOrejas() {
        return longitudOrejas;
    }

    public void setLongitudOrejas(double longitudOrejas) {
        this.longitudOrejas = longitudOrejas;
    }

    //Polimorfismo del método
    @Override
    public void hacerSonido(){
        System.out.println("El conejo chilla mientras mueve sus orejas");
    }

    //Método propio de la clase
    public void saltar(){
        System.out.println(getNombre()+" salta muy alto");
    }
}
