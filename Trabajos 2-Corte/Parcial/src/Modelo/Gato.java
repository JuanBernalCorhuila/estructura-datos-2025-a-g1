package Modelo;

public class Gato extends Animal{
    private String colorPelaje;

    //Método constructor
    public Gato(String nombre, int edad, double peso, String colorPelaje) {
        super(nombre, edad, peso);
        this.colorPelaje = colorPelaje;
    }

    //Get y Set
    public String getColorPelaje() {
        return colorPelaje;
    }

    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    //Polimorfismo del método
    @Override
    public void hacerSonido(){
        System.out.println("El gato maulla MIAU MIAU");
    }

    //Método propio de la clase
    public void ronronear(){
        System.out.println(getNombre()+" ronronea");
    }
}
