import java.util.Scanner;
public class Parcial {
    public static void main(String []args) {
        Scanner leer = new Scanner(System.in);
        String nombre ="";
        String apellido ="";
        String nomProducto ="";
        int cantidad=0;
        float valUnitario=0;
        double valNeto=0;
        double valBruto=0;
        double valDescuento=0;
        System.out.println("-----HOLA BIENVENIDO-----");
        System.out.println("Digite su nombre porfavor");
        nombre = leer.next();
        System.out.println("Digite su apellido porfavor:");
        apellido = leer.next();
        System.out.println("Digite el nombre del producto porfavor:");
        nomProducto = leer.next();
        System.out.println("Ingrese el valor del producto porfavor:");
        valUnitario = leer.nextFloat();
        if(valUnitario<=0){
            System.out.println("El valor debe de ser mayor a 0\n"+
                    "cancelando...");
            return;
        }
        System.out.println("Ingrese porfavor la cantidad a comprar:");
        cantidad = leer.nextInt();
        if(cantidad<=0){
            System.out.println("La cantidad debe de ser mayor a 0\n" + "cancelando...");
            return;
        }
        valBruto = cantidad * valUnitario;
        if(cantidad>10 && cantidad<20) {
            valDescuento = 0.05 * valBruto;
        } else if (cantidad>19) {
            valDescuento = 0.07 + valBruto;
        }
        valNeto = valBruto - valDescuento;
        System.out.println("---Información procesada---");
        System.out.println("Nombre del cliente: "+nombre+" "+apellido+
                "\nValor unitario: "+valUnitario+
                "\nCantidad: "+cantidad+
                "\nValor bruto: "+valBruto+
                "\nValor Neto: "+valNeto+
                "\nValor Descuento: "+valDescuento);
    }
}
