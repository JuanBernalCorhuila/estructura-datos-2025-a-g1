package Sistema;

public class Producto {
    private String codigo;
    private String nombre;
    private int cantidad;
    private double precio;

    // Constructor
    // --- FUNCIONES (Constructor) ---
    public Producto(String codigo, String nombre, int cantidad, double precio) { // <--- FUNCIÓN: Constructor
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    // Getters y Setters
    // --- FUNCIONES (Getters) ---
    public String getCodigo() { // <--- FUNCIÓN: Getter
        return codigo;
    }

    public String getNombre() { // <--- FUNCIÓN: Getter
        return nombre;
    }

    // --- FUNCIONES (Setters) ---
    public void setNombre(String nombre) { // <--- FUNCIÓN: Setter
        this.nombre = nombre;
    }

    public int getCantidad() { // <--- FUNCIÓN: Getter
        return cantidad;
    }

    public void setCantidad(int cantidad) { // <--- FUNCIÓN: Setter
        this.cantidad = cantidad;
    }

    public double getPrecio() { // <--- FUNCIÓN: Getter
        return precio;
    }

    public void setPrecio(double precio) { // <--- FUNCIÓN: Setter
        this.precio = precio;
    }

    // Método toString para imprimir el producto
    // --- FUNCIONES (Método toString) ---
    @Override
    public String toString() { // <--- FUNCIÓN: toString (proporciona una representación en String del objeto)
        // Aseguramos un formato consistente con printf para alineación
        return String.format("%-10s %-20s %-10d $%-9.2f", codigo, nombre, cantidad, precio);
    }
}