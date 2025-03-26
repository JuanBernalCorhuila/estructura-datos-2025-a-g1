package Modelo;

public class Circulo extends Figura{
    @Override
    public void Mostrar2(){
        System.out.println("La figura se llama: "+this.getNombre()+"\n" +
                "Su area se calcula mediante la fórmula: "+this.getFormula()+"\n"+
                "El radio que digitó es: "+this.getBase()+"\n"+
                "El área ya calculada es: "+this.getArea()+"\n"
        );
    }
}
