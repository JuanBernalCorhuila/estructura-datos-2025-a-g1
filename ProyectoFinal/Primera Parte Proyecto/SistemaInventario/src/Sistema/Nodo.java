package Sistema;

public class Nodo {
    String nombre;
    Nodo izquierda, derecha;

    public Nodo(String nombre) {
        this.nombre = nombre;
        izquierda = derecha = null;
    }
}

