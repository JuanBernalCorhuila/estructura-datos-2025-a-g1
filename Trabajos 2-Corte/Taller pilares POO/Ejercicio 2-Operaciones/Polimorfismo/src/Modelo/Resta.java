package Modelo;

public class Resta extends Operaciones {

    @Override
    public void Visualizar(){
        System.out.println("La operación es la "+this.getNombre()+", su operador es ("+this.getOperador()+")."+
                "\nEl primer número elegido: "+this.getNum1()+"\n"+
                "Y este es el segundo: "+this.getNum2()+"\n"+
                "Resultado = "+this.getResultado()+"\n");
    }
}
