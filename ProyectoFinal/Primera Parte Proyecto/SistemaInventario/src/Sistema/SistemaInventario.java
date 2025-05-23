package Sistema;
import java.util.*;
import java.util.ArrayList;
import java.util.Queue;
import java.util.LinkedList;

public class SistemaInventario {

    public static void main(String[] args) {
        ArbolBinario arbol = new ArbolBinario();
        Scanner leer = new Scanner(System.in);

        /* Creamos un Map para almacenar los productos con el código como clave
        Usamos el Hashmap para obtener los pares en orden */
        Map<String, Producto> inventario = new HashMap<>();
        ArrayList<Producto> listaProductos = new ArrayList<>(); //ArrayList
        Stack<Producto> pila = new Stack<>();  // Pila para productos
        Queue<Producto> cola = new LinkedList<>();//Cola

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
                    "\n7. Operaciones adicionales"+
                    "\n8. Despachar productos ingresados"+
                    "\n9. Salir"+
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
                            // Lo añadimos a la pila
                            Producto prod = new Producto(codigo, nombre, cantidad, precio);
                            pila.push(prod);
                            // Añadimos en el ArrayList
                            listaProductos.add(nuevo);

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
                //Búsqueda del producto
                    buscarProductoPorCodigo(inventario, leer, contador);
                    break;
                case 3:
                    // Listar productos
                    System.out.println("╔═══════════════════════════════════════════╗\n" +
                            "            LISTA DE PRODUCTOS\n" +
                            "╚═══════════════════════════════════════════╝");
                    System.out.println("\nComo desea listar los productos:"+
                            "\n1. Lista normal"+
                            "\n2. Por arraylist"+
                            "\n3. Por precio"+
                            "\n4. Por orden alfabetico");
                    System.out.println("Elija una opción: ");
                    int opcionLista = leer.nextInt();
                    leer.nextLine();//Limpiamos buffer

                    //Se verifica que se elija una opción correcta
                    if(opcionLista<=0 || opcionLista>04) {
                        System.out.println("Opción inválida");
                        break;

                    }else if(opcionLista==1) {
                        //Normal
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

                    }else if(opcionLista==2) {
                        // Mostrar productos almacenados en el ArrayList
                        System.out.println("╔═══════════════════════════════════════════╗\n" +
                                "        LISTADO DESDE ARRAYLIST\n" +
                                "╚═══════════════════════════════════════════╝");

                        //Se verifica que los productos estén registrados
                        if (listaProductos.isEmpty()) {
                            System.out.println("No hay productos registrados en el ArrayList.");
                        } else {
                            System.out.println("--------------------------------------------------------------------");
                            System.out.printf("%-10s %-20s %-10s %-10s\n", "CÓDIGO", "NOMBRE", "CANTIDAD", "PRECIO");
                            System.out.println("--------------------------------------------------------------------");
                            for (Producto p : listaProductos) {
                                System.out.println(p.toString());
                            }
                        }
                        break;

                    }else if(opcionLista==3) {
                        // Ordenar productos por precio (Método Burbuja)
                        System.out.println("╔═══════════════════════════════════════════╗\n" +
                                "         ORDENAR PRODUCTOS POR PRECIO\n" +
                                "╚═══════════════════════════════════════════╝");

                        //Se verifica que los productos estén registrados
                        if (contador == 0) {
                            System.out.println("No hay productos registrados.");
                        } else {
                            // Método burbuja para ordenar por precio
                            for (int m = 0; m < contador - 1; m++) {
                                for (int n = 0; n < contador - m - 1; n++) {
                                    if (precios[n] > precios[n + 1]) {
                                        // Intercambiar precios
                                        double tempPrecio = precios[n];
                                        precios[n] = precios[n + 1];
                                        precios[n + 1] = tempPrecio;

                                        // Intercambiar cantidades
                                        int tempCantidad = cantidades[n];
                                        cantidades[n] = cantidades[n + 1];
                                        cantidades[n + 1] = tempCantidad;

                                        // Intercambiar códigos
                                        String tempCodigo = codigos[n];
                                        codigos[n] = codigos[n + 1];
                                        codigos[n + 1] = tempCodigo;

                                        // Intercambiar nombres
                                        String tempNombre = nombres[n];
                                        nombres[n] = nombres[n + 1];
                                        nombres[n + 1] = tempNombre;
                                    }
                                }
                            }

                            // Mostramos los productos ordenados
                            System.out.println("\nProductos ordenados por precio (menor a mayor):");
                            System.out.println("--------------------------------------------------------------------");
                            System.out.printf("%-10s %-20s %-10s %-10s\n", "CÓDIGO", "NOMBRE", "CANTIDAD", "PRECIO");
                            System.out.println("--------------------------------------------------------------------");
                            for (int k = 0; k < contador; k++) {
                                System.out.println(String.format("%-10s %-20s %-10d $%-9.2f", codigos[k], nombres[k], cantidades[k], precios[k]));
                            }
                        }
                        break;

                    } else if (opcionLista==4) {
                    // Árbol binario: insertar productos y mostrar en orden
                            System.out.println("╔═══════════════════════════════════════════╗\n" +
                                    "     ÁRBOL BINARIO DE PRODUCTOS (NOMBRE)\n" +
                                    "╚═══════════════════════════════════════════╝");

                            //Se verifica que los productos estén registrados
                            if (contador == 0) {
                                System.out.println("No hay productos registrados.");
                            } else {
                                // Insertamos productos por nombre en el árbol
                                for (int m = 0; m < contador; m++) {
                                    arbol.insertar(nombres[m]);
                                }

                                System.out.println("Productos ordenados alfabéticamente:");
                                arbol.mostrarInOrden();
                            }
                            break;
                    }

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

                                    // Actualizar cantidad en el ArrayList
                                    for (Producto p : listaProductos) {
                                        if (p.getCodigo().equals(insumo.getCodigo())) {
                                            p.setCantidad(nuevaCantidad);
                                            break;
                                        }
                                    }

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

                                    //En el arraylist
                                    for (Producto p : listaProductos) {
                                        if (p.getCodigo().equals(insumo.getCodigo())) {
                                            p.setPrecio(nuevoPrecio);
                                            break;
                                        }
                                    }

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
                                    String nuevoNombre = leer.nextLine().toLowerCase();//A minúsculas

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

                                    // Se actualiza en el ArrayList
                                    for (Producto p : listaProductos) {
                                        if (p.getCodigo().equals(insumo.getCodigo())) {
                                            p.setNombre(nuevoNombre);
                                            p.setCantidad(nuevaCantidad);
                                            p.setPrecio(nuevoPrecio);
                                            break;
                                        }
                                    }

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

                            // Eliminar del ArrayList
                            listaProductos.removeIf(p -> p.getCodigo().equals(eliminar));

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
                   //Operaciones
                    System.out.println("╔═══════════════════════════════════════════╗\n" +
                            "            OPERACIONES ADICIONALES\n" +
                            "╚═══════════════════════════════════════════╝");
                    System.out.println("1. Ver último producto agregado");
                    System.out.println("2. Sacar último producto agregado");
                    System.out.print("Elija una opción: ");
                    int opcionPila = Integer.parseInt(leer.nextLine());

                    //Switch para manejar la pila
                    switch(opcionPila) {
                        case 1:
                            if (pila.isEmpty()) {
                                System.out.println("Inventario vacío.");
                            } else {
                                Producto ultimo = pila.peek();
                                System.out.println("Último producto agregado:");
                                System.out.println("--------------------------------------------------------------------");
                                System.out.printf("%-10s %-20s %-10s %-10s\n", "CÓDIGO", "NOMBRE", "CANTIDAD", "PRECIO");
                                System.out.println("--------------------------------------------------------------------");
                                System.out.println(ultimo.toString());
                            }
                            break;

                        case 2:
                            if (pila.isEmpty()) {
                                System.out.println("Inventario vacío, no hay productos para eliminar.");
                            } else {
                                Producto eliminado = pila.pop();
                                System.out.println("Producto removido del inventario:");
                                System.out.println("--------------------------------------------------------------------");
                                System.out.printf("%-10s %-20s %-10s %-10s\n", "CÓDIGO", "NOMBRE", "CANTIDAD", "PRECIO");
                                System.out.println("--------------------------------------------------------------------");
                                System.out.println(eliminado.toString());

                                // Eliminar del Map
                                inventario.remove(eliminado.getCodigo());

                                // Eliminar del ArrayList
                                listaProductos.removeIf(p -> p.getCodigo().equals(eliminado.getCodigo()));

                                // Eliminar de los vectores
                                int indice = -1;
                                for (int m = 0; m < contador; m++) {
                                    if (codigos[m].equals(eliminado.getCodigo())) {
                                        indice = m;
                                        break;
                                    }
                                }

                                /* Ciclo para reordenar los datos
                                     Desplazamos los elementos una posición a la izquierda */
                                if (indice != -1) {
                                    for (int m = indice; m < contador - 1; m++) {
                                        codigos[m] = codigos[m + 1];
                                        nombres[m] = nombres[m + 1];
                                        cantidades[m] = cantidades[m + 1];
                                        precios[m] = precios[m + 1];
                                    }
                                    contador--;
                                }
                            }
                            break;

                        default:
                            System.out.println("Opción inválida.");
                    }
                    break;

                case 8:
                    System.out.println("╔═══════════════════════════════════════════╗\n" +
                            "                   COLA\n" +
                            "╚═══════════════════════════════════════════╝");

                    // Vaciar la cola antes por si ya tiene elementos (para evitar duplicados)
                    cola.clear();

                    // Agregar productos existentes a la cola desde los vectores
                    for (int m = 0; m < contador; m++) {
                        Producto p = new Producto(codigos[m], nombres[m], cantidades[m], precios[m]);
                        cola.offer(p);
                    }

                    // Mostrar productos en cola
                    System.out.println("\n------------PRODUCTOS EN COLA----------");
                    System.out.println("--------------------------------------------------------------------");
                    System.out.printf("%-10s %-20s %-10s %-10s\n", "CÓDIGO", "NOMBRE", "CANTIDAD", "PRECIO");
                    System.out.println("--------------------------------------------------------------------");

                    for (Producto p : cola) {
                        System.out.println(p.toString());
                    }

                    // Atendiendo productos y eliminándolos de todas partes
                    System.out.println("\nAtendiendo productos en orden de entrada:");

                    while (!cola.isEmpty()) {
                        Producto atendido = cola.poll(); // Sacamos el primero
                        System.out.println("Producto atendido: " + atendido);

                        // Eliminar del Map
                        inventario.remove(atendido.getCodigo());

                        // Eliminar del ArrayList
                        listaProductos.removeIf(p -> p.getCodigo().equals(atendido.getCodigo()));

                        // Eliminar del arreglo
                        for (int m = 0; m < contador; m++) {
                            if (codigos[m].equals(atendido.getCodigo())) {
                                for (int j = m; j < contador - 1; j++) {
                                    codigos[j] = codigos[j + 1];
                                    nombres[j] = nombres[j + 1];
                                    cantidades[j] = cantidades[j + 1];
                                    precios[j] = precios[j + 1];
                                }
                                contador--; // Reducimos el número de productos
                                break;
                            }
                        }
                    }
                    break;

                case 9:
                    // Salir
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    // Si la opción no es válida
                    System.out.println("Opción inválida, intentelo de nuevo.");
                    break;
            }
            //Espacio para que el usuario pueda leer los resultados(excepto si presiona 7)
            if (opcion != 9) {
                System.out.print("\nPresione ENTER para continuar...\n");
                leer.nextLine();
            }

        } while(opcion != 9);

        //Se cierra el Scanner
        leer.close();
    }

    // Función para buscar un producto por código
    public static void buscarProductoPorCodigo(Map<String, Producto> inventario, Scanner leer, int contador) {
        if (contador == 0) {
            System.out.println("No se han registrado productos, por favor registre un producto antes.");
        } else {
            System.out.println("╔═══════════════════════════════════════════╗\n" +
                    "            BÚSQUEDA DE PRODUCTOS\n" +
                    "╚═══════════════════════════════════════════╝");
            System.out.print("\nIngrese el código del producto: ");
            String buscar = leer.nextLine();

            if (inventario.containsKey(buscar)) {
                Producto encontrado = inventario.get(buscar);
                System.out.println("\n--- PRODUCTO SOLICITADO ---");
                System.out.println("--------------------------------------------------------------------");
                System.out.printf("%-10s %-20s %-10s %-10s\n", "CÓDIGO", "NOMBRE", "CANTIDAD", "PRECIO");
                System.out.println("--------------------------------------------------------------------");
                System.out.println(encontrado);
            } else {
                System.out.println("\nProducto no encontrado.");
            }
        }
    }
}