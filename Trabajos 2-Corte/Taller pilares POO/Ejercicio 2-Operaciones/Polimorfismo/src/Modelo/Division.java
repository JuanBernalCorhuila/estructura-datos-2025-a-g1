package Modelo;

public class Division extends Operaciones{

    @Override
    public void Visualizar(){
        System.out.println(this.getNombre()+" termino donde dividir entre 0 no es posible."+"\n"+
                "Tiene como operador: "+this.getOperador()+"\n"+
                "----Su primer número: "+this.getNum1()+"----"+"\n"+
                "----Su segundo número: "+this.getNum2()+"----"+"\n"+
                "Resultado = "+this.getResultado()+":)"+"\n");
    }
}
