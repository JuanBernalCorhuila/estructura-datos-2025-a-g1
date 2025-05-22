package Modelo;

public abstract class Animal {
    private String nombre;
    private int edad;
    private double peso;

    public Animal (String nombre, int edad, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public abstract void hacerSonido();

    public void mostrarInformacion(){
        System.out.println("Nombre: "+getNombre()+
                "\nEdad: "+getEdad()+
                "\nPeso: "+getPeso());
    }

    public void animalJoven(){
        if(getEdad()>3){
            System.out.println("El animal es adulto");
        }else{
            if(getEdad()<0){
                System.out.println("Edad no válida");
            }else{
                System.out.println("El animal es jóven");
            }
        }
    }
}
