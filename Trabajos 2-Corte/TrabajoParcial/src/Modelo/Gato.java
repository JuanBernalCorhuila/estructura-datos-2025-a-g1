package Modelo;

public class Gato extends Animal{
    private String colorPelaje;

    public Gato(String nombre, int edad, double peso, String colorPelaje) {
        super(nombre, edad, peso);
        this.colorPelaje = colorPelaje;
    }

    public String getColorPelaje() {
        return colorPelaje;
    }
    public void setColorPelaje(String colorPelaje) {
        this.colorPelaje = colorPelaje;
    }

    @Override
    public void hacerSonido(){
        System.out.println("El gato maulla: MIAU MIAU");
    }

    public void ronronear(){
        System.out.println(getNombre()+" está ronroneando en el sofá");
    }
}