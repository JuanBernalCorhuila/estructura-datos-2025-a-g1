package Modelo;

public class Rectangulo extends Figura {
    private String tipo;

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    @Override
    public void Mostrar(){
        System.out.println("La figura se conoce como: "+this.getNombre()+"\n"+"\n"+
                "Es familiar al cuadrado pero este tiene dos pares de lados iguales"+
                "\nComo dato extra, se le conoce como "+this.getTipo()+"\n"+
                "\nSu fórmula es: "+this.getFormula()+"\n"+
                "La base que digitaste fue: "+this.getBase()+"\n"+
                "La altura que digitaste fue: "+this.getAltura()+"\n" +
                "Su área se ha calculado y es: "+this.getArea()+"\n"
        );
    }
}