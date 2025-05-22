package Reservas;

public class ReservaNormal extends Reserva {
    //Atributo específico
    private double valReservaNormal;

    //Constructor
    public ReservaNormal(String nombreCliente, int numeroPersonas, int noches, double valReservaNormal) {
        super(nombreCliente, numeroPersonas, noches);
        this.valReservaNormal = valReservaNormal;
    }

    //Getter y Setter
    public double getValReservaNormal() {
        return valReservaNormal;
    }

    public void setValReservaNormal(double valReservaNormal) {
        this.valReservaNormal = valReservaNormal;
    }

    //Mediante el polimorfismo implementamos el método abstracto
    @Override
    public double costo() {
        return getNumeroPersonas() * (getNoches() * valReservaNormal);
    }

    //Mediante el polimorfismo mostramos la info de manera personalizada
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("\nTipo de reserva: Normal"+
                "\nValor reserva: "+costo()+"$");
    }
}