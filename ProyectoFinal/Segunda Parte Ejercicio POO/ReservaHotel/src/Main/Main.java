package Main;

import Hotel.Hotel;
import Reservas.Reserva;
import Reservas.ReservaNormal;
import Reservas.ReservaPremium;

public class Main {
    public static void main(String[] args) {
        //Instancia de reserva normal
        Reserva reserva1 = new ReservaNormal("Carlos",5,3,20);
        //Instancia de reserva premium
        Reserva reserva2 = new ReservaPremium("Ana María", 5,3,50,30);

        //Creación del objeto hotel
        Hotel hotel = new Hotel("Hotel Estrella");

        //Se le asigna la reserva normal al hotel y muestra la info (interacción entre objetos)
        hotel.asignarReserva(reserva1);
        hotel.mostrarReserva();

        System.out.println("---------------------------\n");

        //Cambio de la reserva normal del hotel por una reserva premium
        hotel.asignarReserva(reserva2);
        hotel.mostrarReserva();
    }
}