package Sistema;

public class ArbolBinario {
    Nodo raiz;

    public void insertar(String nombre) {
        raiz = insertarRec(raiz, nombre);
    }

    private Nodo insertarRec(Nodo raiz, String nombre) {
        if (raiz == null) {
            raiz = new Nodo(nombre);
            return raiz;
        }

        if (nombre.compareToIgnoreCase(raiz.nombre) < 0)
            raiz.izquierda = insertarRec(raiz.izquierda, nombre);
        else if (nombre.compareToIgnoreCase(raiz.nombre) > 0)
            raiz.derecha = insertarRec(raiz.derecha, nombre);

        return raiz;
    }

    public void mostrarInOrden() {
        mostrarInOrdenRec(raiz);
    }

    private void mostrarInOrdenRec(Nodo nodo) {
        if (nodo != null) {
            mostrarInOrdenRec(nodo.izquierda);
            System.out.println("→ " + nodo.nombre);
            mostrarInOrdenRec(nodo.derecha);
        }
    }
}
