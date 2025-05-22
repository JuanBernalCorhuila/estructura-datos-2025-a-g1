package Sistema;
import java.util.*;

public class SistemaInventario {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        /* Creamos un Map para almacenar los productos con el código como clave
        Usamos el hashmap para acceder a los pares de manera más rápida */
        Map<String, Producto> inventario = new HashMap<>();

        //Constante para indicar la cantidad máxima de productos que se pueden registrar
        final int maxProductos = 50;

        // Creamos vectores para guardar la información de los productos
        String[] codigos = new String[maxProductos];
        String[] nombres = new String[maxProductos];
        int[] cantidades = new int[maxProductos];
        double[] precios = new double[maxProductos];

        // Contador para saber cuántos productos se han ingresado
        int contador = 0;

        // Variable para el menú
        int opcion;
        do {
            // Menú principal
            System.out.println("╔══════════════════ ≪ °❈° ≫ ══════════════════╗\n" +
                    " BIENVENIDO AL SISTEMA DE GÉSTION DE INVENTARIO\n" +
                    "╚══════════════════ ≪ °❈° ≫ ══════════════════╝");
            System.out.println("\n1. Registrar producto"+
                    "\n2. Buscar producto"+
                    "\n3. Listar productos"+
                    "\n4. Modificar producto"+
                    "\n5. Eliminar producto"+
                    "\n6. Valor total del inventario"+
                    "\n7. Salir"+
                    "\nElija una opción: ");
            opcion = leer.nextInt();
            leer.nextLine(); // Limpiamos buffer

            switch(opcion) {
                case 1:
                    //Registrar productos

                    //Hacemos un condicional para verificar que no se pase de la cantidad máxima de productos
                    if (contador < maxProductos) {
                        System.out.println("╔═══════════════════════════════════════════╗\n" +
                                "            REGISTRO DE PRODUCTOS\n" +
                                "╚═══════════════════════════════════════════╝");

                        System.out.print("\nIngrese el código del producto: ");
                        String codigo = leer.nextLine();

                        // Verificar a través de la clave del map si el código se encuentra o no
                        if (inventario.containsKey(codigo)) {
                            System.out.println("Error este código ya ha sido registrado.");
                        } else {

                            System.out.print("Por favor ingrese el nombre del producto: ");
                            String nombre = leer.nextLine().toLowerCase();//Pasamos a minúscula

                            System.out.print("Ingrese la cantidad de productos disponibles: ");
                            int cantidad = leer.nextInt();

                            //Se valida que la cantidad no sea negativa
                            if (cantidad < 0) {
                                System.out.println("La cantidad no debe ser negativa");
                                break;
                            }
                            System.out.print("Ingrese el precio: ");
                            double precio = leer.nextDouble();

                            //Validamos que el precio sea el correcto
                            if (precio <= 0) {
                                System.out.println("Vaya, el precio no puede ser negativo");
                                break;
                            }

                            // Creamos el producto
                            Producto nuevo = new Producto(codigo, nombre, cantidad, precio);

                            // Lo añadimos al Map
                            inventario.put(codigo, nuevo);

                            // Se guardan los datos recogidos en los vectores
                            codigos[contador] = codigo;
                            nombres[contador] = nombre;
                            cantidades[contador] = cantidad;
                            precios[contador] = precio;
                            contador++;

                            System.out.println("Producto registrado correctamente.");
                        }

                    } else {
                        System.out.println("Cantidad máxima alcanzada (50)");
                    }
                    break;

                case 2:
                    // Búsqueda del producto

                    //Verificamos que si se hubieran registrado productos
                    if (contador == 0) {
                        System.out.println("No se han registrado productos, porfavor registre un producto antes");
                    } else {
                        System.out.println("╔═══════════════════════════════════════════╗\n" +
                                "            BÚSQUEDA DE PRODUCTOS\n" +
                                "╚═══════════════════════════════════════════╝");
                        System.out.print("\nIngrese el código del producto: ");
                        String buscar = leer.nextLine();

                        // Verificamos si existe en el inventario
                        if (inventario.containsKey(buscar)) {
                            Producto encontrado = inventario.get(buscar);//Se obtienen las claves del map
                            System.out.println("\n--- PRODUCTO SOLICITADO ---");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.printf("%-10s %-20s %-10s %-10s\n", "CÓDIGO", "NOMBRE", "CANTIDAD", "PRECIO");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println(encontrado); // Usamos el toString
                        } else {
                            System.out.println("\nProducto no encontrado.");
                        }
                    }
                    break;

                case 3:
                    // Listar productos
                    System.out.println("\n--- LISTA DE PRODUCTOS ---");
                    System.out.println("--------------------------------------------------------------------");
                    System.out.printf("%-10s %-20s %-10s %-10s\n", "CÓDIGO", "NOMBRE", "CANTIDAD", "PRECIO");
                    System.out.println("--------------------------------------------------------------------");

                    //Se verifica si hay productos registrados
                    if (inventario.isEmpty()) {
                        System.out.println("\nNo hay productos registrados.");
                    } else {
                        /* Se usa un for - each para recorrer el map
                        Le pedimos que nos entregue el valor de cada par del map */
                        for (Map.Entry<String, Producto> elemento : inventario.entrySet()) {
                            System.out.println(elemento.getValue());
                        }
                    }
                    break;

                case 4:
                    // Modificar productos

                    //Se verifica que se hubieran registrado productos
                    if (contador == 0) {
                        System.out.println("No se han registrado productos");
                    } else {
                        System.out.println("╔═══════════════════════════════════════════╗\n" +
                                "            MODIFICAR PRODUCTOS\n" +
                                "╚═══════════════════════════════════════════╝");
                        System.out.print("\nIngrese el código del producto a modificar: ");
                        String modificar = leer.nextLine();

                        // Verificamos si el producto existe
                        if (inventario.containsKey(modificar)) {
                            Producto insumo = inventario.get(modificar);

                            System.out.println("\n-------- PRODUCTO ACTUAL --------");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.printf("%-10s %-20s %-10s %-10s\n", "CÓDIGO", "NOMBRE", "CANTIDAD", "PRECIO");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.println(insumo+"\n");

                            //Preguntamos que quiere modificar
                            System.out.println("Desea modificar:\n" +
                                    "1.Cantidad\n" +
                                    "2.Precio" +
                                    "\n3.Todo");
                            System.out.println("Elija una opción: ");
                            int operacion = leer.nextInt();
                            leer.nextLine();//Limpiamos buffer

                            //Validamos que escoja una opción válida
                            if (operacion <= 0 || operacion > 3) {
                                System.out.println("Elija una opción válida");
                            } else {
                                if (operacion == 1) {
                                    System.out.print("Nueva cantidad: ");
                                    int nuevaCantidad = leer.nextInt();
                                    leer.nextLine();//Limpiamos buffer

                                    //Verificamos que la cantidad sea positiva
                                    if(nuevaCantidad<0){
                                        System.out.println("La cantidad debe ser positiva");
                                        break;
                                    }

                                    //Se actualiza la cantidad en el map
                                    insumo.setCantidad(nuevaCantidad);

                                    //Se actualiza en el vector
                                    for (int i = 0; i < contador; i++) {
                                        if (codigos[i].equals(modificar)) {
                                            cantidades[i] = nuevaCantidad;
                                            break;
                                        }
                                    }
                                    System.out.println("Cantidad modificada con éxito.");

                                } else if (operacion == 2) {
                                    System.out.print("Nuevo precio: ");
                                    int nuevoPrecio = leer.nextInt();
                                    leer.nextLine();//Limpiamos buffer

                                    //Verificamos que el precio sea positivo
                                    if(nuevoPrecio<0){
                                        System.out.println("El precio debe ser positivo");
                                        break;
                                    }

                                    //Se actualiza el precio en el map
                                    insumo.setPrecio(nuevoPrecio);

                                    //Se actualiza en el vector
                                    for (int i = 0; i < contador; i++) {
                                        if (codigos[i].equals(modificar)) {
                                            precios[i] = nuevoPrecio;
                                            break;
                                        }
                                    }
                                    System.out.println("Precio modificada con éxito.");

                                } else if (operacion == 3) {
                                    System.out.print("Nuevo nombre: ");
                                    String nuevoNombre = leer.nextLine();

                                    System.out.print("Nueva cantidad: ");
                                    int nuevaCantidad = leer.nextInt();

                                    //Verificamos que la cantidad sea positiva
                                    if(nuevaCantidad<0){
                                        System.out.println("La cantidad debe ser positiva");
                                        break;
                                    }

                                    System.out.print("Nuevo precio: ");
                                    double nuevoPrecio = leer.nextDouble();

                                    //Verificamos que el precio sea positivo
                                    if(nuevoPrecio<0){
                                            System.out.println("El precio debe ser positivo");
                                        break;
                                    }

                                    // Se actualiza el producto en el map
                                    insumo.setNombre(nuevoNombre);
                                    insumo.setCantidad(nuevaCantidad);
                                    insumo.setPrecio(nuevoPrecio);

                                    // Se actualiza el producto en los vectores
                                    for (int i = 0; i < contador; i++) {
                                        if (codigos[i].equals(modificar)) {
                                            nombres[i] = nuevoNombre;
                                            cantidades[i] = nuevaCantidad;
                                            precios[i] = nuevoPrecio;
                                            break;
                                        }
                                    }
                                    System.out.println("Producto modificado con éxito.");
                                }
                            }
                        } else {
                            System.out.println("El producto no existe.");
                        }
                    }
                    break;

                case 5:
                    // Eliminar producto

                    //Verificamos que se hubieran registrado productos
                    if (contador == 0) {
                        System.out.println("No se han registrado productos aún");
                    } else{
                        System.out.println("╔═══════════════════════════════════════════╗\n" +
                                "            EIMINAR PRODUCTOS\n" +
                                "╚═══════════════════════════════════════════╝");
                        System.out.print("\nIngrese el código del producto: ");
                        String eliminar = leer.nextLine();

                        // Verificamos que exista el código
                        if (inventario.containsKey(eliminar)) {
                            inventario.remove(eliminar); // Lo eliminamos del Map

                             // También de los vectores
                            for (int i = 0; i < contador; i++) {
                                if (codigos[i].equals(eliminar)) {

                                     /* Ciclo para reordenar los datos
                                     Desplazamos los elementos una posición a la izquierda */
                                    for (int j = i; j < contador - 1; j++) {
                                     codigos[j] = codigos[j + 1];
                                     nombres[j] = nombres[j + 1];
                                     cantidades[j] = cantidades[j + 1];
                                     precios[j] = precios[j + 1];
                                }
                                contador--; // Reducimos la cantidad total del producto
                                break;
                                 }
                            }

                            System.out.println("Producto eliminado con éxito.");
                        } else {
                            System.out.println("Producto no encontrado.");
                        }
                    }
                    break;

                case 6:
                    // Calcular el valor total del inventario

                    System.out.println("╔═══════════════════════════════════════════╗\n" +
                            "            VALOR TOTAL DEL INVENTARIO\n" +
                            "╚═══════════════════════════════════════════╝");

                    //Declaramos dos variables para usarlas en el while
                    double total = 0;
                    int i = 0;

                    // Usamos el while para recorrer el vector de precios
                    while (i < contador) {
                        total += cantidades[i] * precios[i]; // valor = cantidad * precio
                        i++;
                    }

                    if(total==0){
                        System.out.println("\nEl valor total del inventario es: $" + total+
                                "\nNo se han registrado productos");
                    }else {
                        System.out.println("\nEl valor total del inventario es: $" + total);
                    }
                    break;

                case 7:
                    // Salir
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    // Si la opción no es válida
                    System.out.println("Opción inválida, intentelo de nuevo.");
                    break;
            }
            //Espacio para que el usuario pueda leer los resultados(excepto si presiona 7)
            if (opcion != 7) {
                System.out.print("\nPresione ENTER para continuar...\n");
                leer.nextLine();
            }

        } while(opcion != 7);

        //Se cierra el Scanner
        leer.close();
    }
}