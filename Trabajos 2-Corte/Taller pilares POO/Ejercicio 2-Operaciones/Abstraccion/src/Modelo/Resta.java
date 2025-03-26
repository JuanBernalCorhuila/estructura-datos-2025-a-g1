package Modelo;

public class Resta extends Operaciones {
    private String parte;

    public String getParte(){
        return parte;
    }

    public void setParte(String parte){
        this.parte = parte;
    }

    @Override
    public void Visualizar(){
        System.out.println("La operación es la "+this.getNombre()+", su operador es ("+this.getOperador()+").\n"+
                "\nSabías que en la resta el "+this.getParte()+" es el número al que se le resta otra cantidad.\n"+
                "\nEl primer número elegido: "+this.getNum1()+"\n"+
                "Y este es el segundo: "+this.getNum2()+"\n"+
                "Resultado = "+this.getResultado()+"\n");
    }
}