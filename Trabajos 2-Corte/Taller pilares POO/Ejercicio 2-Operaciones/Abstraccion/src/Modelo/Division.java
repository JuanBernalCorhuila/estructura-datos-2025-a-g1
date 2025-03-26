package Modelo;

public class Division extends Operaciones{
    private String simbolo;

    public String getSimbolo(){
        return simbolo;
    }

    public void setSimbolo(String simbolo){
        this.simbolo = simbolo;
    }

    @Override
    public void Visualizar(){
        System.out.println(this.getNombre()+" termino donde dividir entre 0 no es posible."+"\n"+
                "Tiene como operador: "+this.getOperador()+"\n"+
                "----Su primer número: "+this.getNum1()+"----"+"\n"+
                "----Su segundo número: "+this.getNum2()+"----"+"\n"+
                "Resultado = "+this.getResultado()+":)"+"\n"+
                "\nSu otro signo conocido es: "+this.getSimbolo());
    }
}