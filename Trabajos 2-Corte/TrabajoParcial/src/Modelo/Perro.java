package Modelo;

public class Perro extends Animal{
    private String raza;

    public Perro(String nombre, int edad, double peso, String raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void hacerSonido(){
        System.out.println("El perro hace GUAU GUAU");
    }

    public void jugar(){
        System.out.println(getNombre()+" está jugando con la pelota");
    }
}
