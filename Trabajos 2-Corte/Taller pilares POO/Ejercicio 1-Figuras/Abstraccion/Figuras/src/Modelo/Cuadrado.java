package Modelo;

public class Cuadrado extends Figura{
    private int lados;

    public int getLados(){
        return lados;
    }

    public void setLados(int lados){
        this.lados = lados;
    }

    @Override
    public void Mostrar(){
        System.out.println("La figura es: "+this.getNombre()+". Su área se calcula con la fórmula: "+this.getFormula()+"\n"+
                "Como la base y la altura son iguales: "+"\n"+
                "Su base es:"+this.getBase()+"\n" +
                "Y su altura: "+this.getAltura()+"\n"+
                "El área en ese orden de ideas es: "+this.getArea()+"\n"+
                "Como dato extra, el número de lados de un cuadrado es: "+this.getLados()+"\n"
        );
    }
}
