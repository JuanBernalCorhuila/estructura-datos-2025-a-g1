package Reservas;

public class ReservaPremium extends Reserva {
    //Atributos específicos
    private double valReservaPremium;
    private double costoExtra;

    //Constructor
    public ReservaPremium(String nombreCliente, int numeroPersonas, int noches, double valReservaPremium, double costoExtra) {
        super(nombreCliente, numeroPersonas, noches);
        this.valReservaPremium = valReservaPremium;
        this.costoExtra = costoExtra;
    }

    //Getters y Setters
    public double getValReservaPremium() {
        return valReservaPremium;
    }

    public void setValReservaPremium(double valReservaPremium) {
        this.valReservaPremium = valReservaPremium;
    }

    public double getCostoExtra() {
        return costoExtra;
    }

    public void setCostoExtra(double costoExtra) {
        this.costoExtra = costoExtra;
    }

    //Mediante el polimorfismo implementamos el método abstracto
    @Override
    public double costo() {
        return (getNumeroPersonas() * (getNoches() * valReservaPremium))+costoExtra;
    }

    //Mediante el polimorfismo mostramos la info de manera personalizada
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("\nTipo de reserva: Normal"+
                "\nValor reserva: "+costo()+"$");
    }
}