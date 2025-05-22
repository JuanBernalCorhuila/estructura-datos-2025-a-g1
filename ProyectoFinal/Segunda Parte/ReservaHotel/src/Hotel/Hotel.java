package Hotel;

import Reservas.Reserva;

public class Hotel {
    //Atributos específicos
    private String nombre;
    private Reserva reserva;//Atributo que permite almacenar cualquier tipo de reserva

    //constructor
    public Hotel(String nombre) {
        this.nombre = nombre;
    }

    //Método para asignar reserva al hotel
    public void asignarReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    //Método para mostrar la info del hotel y la reserva
    public void mostrarReserva() {
        System.out.println("Hotel: " + nombre);
        if (reserva != null) {
            reserva.mostrarInfo();
        } else {
            System.out.println("No hay reserva asignada.");
        }
    }
}

