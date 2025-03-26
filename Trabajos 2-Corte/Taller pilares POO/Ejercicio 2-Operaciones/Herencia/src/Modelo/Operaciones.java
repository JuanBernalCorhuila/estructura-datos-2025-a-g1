package Modelo;

public class Operaciones {
    private String nombre;
    private String operador;
    private double num1;
    private double num2;
    private double resultado;

    //Implementación del método
    public void Visualizar(){
        this.nombre = "Suma";
        this.operador = "+";
        this.num1 = 8;
        this.num2 = 2;
        this.resultado = num1+num2;
        System.out.println("Nombre de la operación: "+this.nombre+"\n" +
                "Operador de la operación: "+this.operador+"\n"+
                "Primer número elegido: "+this.num1+"\n"+
                "Segundo número elegido: "+this.num2+"\n"+
                "Resultado = "+this.resultado+"\n");
    }

}