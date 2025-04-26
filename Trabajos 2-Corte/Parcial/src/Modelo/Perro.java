package Modelo;

public class Perro extends Animal{
    private String raza;

    //Método constructor
    public Perro(String nombre, int edad, double peso, String raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }

    //Get y set
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    //Polimorfismo del método
    @Override
    public void hacerSonido(){
        System.out.println("El perro ladra: GUAU GUAU");
    }

    //Método propio de la clase
    public void jugar(){
        System.out.println(getNombre()+" juega con la pelota");
    }
}
