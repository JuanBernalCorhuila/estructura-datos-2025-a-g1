package Modelo;

public abstract class Operaciones {
    private String nombre;
    private String operador;
    private double num1;
    private double num2;
    private double resultado;

    //Set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setOperador(String operador){
        this.operador = operador;
    }
    public void setNum1(double num1){
        this.num1 = num1;
    }
    public void setNum2(double num2){
        this.num2 = num2;
    }
    public void setResultado(double resultado){
        this.resultado = resultado;
    }
    //Get
    public String getNombre(){
        return this.nombre;
    }
    public String getOperador(){
        return this.operador;
    }
    public double getNum1(){
        return this.num1;
    }
    public double getNum2(){
        return this.num2;
    }
    public double getResultado(){
        return this.resultado;
    }
    //Implementación del método
    public void Visualizar(){
        System.out.println("Nombre de la operación: "+this.getNombre()+"\n" +
                "Operador de la operación: "+this.getOperador()+"\n"+
                "Primer número elegido: "+this.getNum1()+"\n"+
                "Segundo número elegido: "+this.getNum2()+"\n"+
                "Resultado = "+this.getResultado()+"\n");
    }
}