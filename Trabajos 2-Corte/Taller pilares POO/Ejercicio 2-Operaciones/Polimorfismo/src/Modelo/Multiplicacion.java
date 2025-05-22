package Modelo;

public class Multiplicacion extends Operaciones{

    @Override
    public void Visualizar(){
        System.out.println("La "+this.getNombre()+" es una operación aritmética."+"\n"+
                "Su operador es: "+this.getOperador()+"\n"+
                "Digitaste como primer número: "+this.getNum1()+" y como segundo el: "+this.getNum2()+"\n"+
                "Resultado = "+this.getResultado()+"\n");
    }
}
