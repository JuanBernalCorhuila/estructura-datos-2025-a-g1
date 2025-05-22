package Sistema;

public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    // Constructor
    public Producto(String codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Getters y Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Método toString para imprimir el producto
    @Override
    public String toString() {
        //Se usa el format para alinear el texto
        return String.format("%-10s %-20s %-10d $%.2f", codigo, nombre, cantidad, precio);
    }
}

