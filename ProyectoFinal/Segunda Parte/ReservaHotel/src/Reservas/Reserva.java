package Reservas;

public abstract class Reserva {
    //Atributos de la clase
    private String nombreCliente;
    private int numeroPersonas;
    private int noches;

    //Constructor
    public Reserva(String nombreCliente, int numeroPersonas, int noches) {
        this.nombreCliente = nombreCliente;
        this.numeroPersonas = numeroPersonas;
        this.noches = noches;
    }

    //Getters y Setters
    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroPersonas() {
        return numeroPersonas;
    }

    public void setNumeroPersonas(int numeroPersonas) {
        this.numeroPersonas = numeroPersonas;
    }

    public int getNoches() {
        return noches;
    }

    public void setNoches(int noches) {
        this.noches = noches;
    }

    //Método abstracto
    public abstract double costo();

    //Método para mostrar información de las reservas
    public void mostrarInfo(){
        System.out.println("Nombre del cliente: "+ getNombreCliente()+
                "\n Numero de personas: "+getNumeroPersonas()+
                "\n Numero de noches: "+getNoches());
    }
}