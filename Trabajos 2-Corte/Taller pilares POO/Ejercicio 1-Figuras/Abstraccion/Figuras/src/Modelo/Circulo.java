package Modelo;

public class Circulo extends Figura{
    private String caracteristica;

    public String getCaracteristica(){
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica){
        this.caracteristica = caracteristica;
    }

    @Override
    public void Mostrar2(){
        System.out.println("La figura se llama: "+this.getNombre()+"\n" +
                "Su area se calcula mediante la fórmula: "+this.getFormula()+"\n"+
                "El radio que digitó es: "+this.getBase()+"\n"+
                "El área ya calculada es: "+this.getArea()+"\n"+
                "Su nombre de circulo se debe por su característica de ser "+this.getCaracteristica()+"\n"
        );
    }
}