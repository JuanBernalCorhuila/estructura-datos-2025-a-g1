package Modelo;

public abstract class Animal {
    private String nombre;
    private int edad;
    private double peso;

    //Método constructor
    public Animal(String nombre, int edad, double peso){
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

    //Get y set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    //Método abstracto
    public abstract void hacerSonido();

    //Métodos
    public void mostrarInformacion(){
        System.out.println(
                "Nombre: "+getNombre()+
                "\nEdad: "+getEdad()+
                "\nPeso: "+getPeso());
    }

    public void animalEdad(){
        if(getEdad()>3){
            System.out.println(getNombre()+" es Adulto");
        }else {
            if (getEdad()<0){
                System.out.println("Edad no válida");
            }else {
                System.out.println(getNombre()+ " es Joven");
            }
        }
    }

}
