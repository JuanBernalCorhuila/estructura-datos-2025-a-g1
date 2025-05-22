package Modelo;

public class Cuadrado extends Figura{
    @Override
    public void Mostrar(){
        System.out.println("La figura es: "+this.getNombre()+". Su área se calcula con la fórmula: "+this.getFormula()+"\n"+
                "Como la base y la altura son iguales: "+"\n"+
                "Su base es:"+this.getBase()+"\n" +
                "Y su altura: "+this.getAltura()+"\n"+
                "El área en ese orden de ideas es: "+this.getArea()+"\n"
        );
    }
}
