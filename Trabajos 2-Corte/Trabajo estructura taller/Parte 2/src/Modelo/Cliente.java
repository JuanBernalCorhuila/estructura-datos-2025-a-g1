package Modelo;

public class Cliente extends Persona {
    private int numCliente;
    private String historialCompras;

    public Cliente(String nombre, int edad, String direccion, int numCliente, String historialCompras) {
        super(nombre, edad, direccion);
        this.numCliente = numCliente;
        this.historialCompras = historialCompras;
    }

    public int getNumcliente() {
        return numCliente;
    }

    public void setNumCliente(int numCliente) {
        this.numCliente = numCliente;
    }

    public String getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(String historialCompras) {
        this.historialCompras = historialCompras;
    }

    @Override
    public void tipoPersona() {
        System.out.println("----CLIENTE IDENTIFICADO----");
    }

    @Override
    public void lugar() {
        System.out.println("Soy un cliente y vengo a comprar a Alkosto.");
    }
}
