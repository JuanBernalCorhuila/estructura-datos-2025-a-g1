import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        // Crear el mapa
        Map<String, String> capitales = new HashMap<>();

        // Colocar países y sus capitales
        capitales.put("Colombia", "Bogotá");
        capitales.put("Francia", "París");
        capitales.put("Japón", "Tokio");
        capitales.put("Brasil", "Brasilia");

        // Obtener y mostrar la capital de Colombia
        System.out.println("La capital de Colombia es: " + capitales.get("Colombia"));
    }
}