package Modelo;

public class Rectangulo extends Figura {
    @Override
    public void Mostrar(){
        System.out.println("La figura se conoce como: "+this.getNombre()+"\n"+
                "Es familiar al cuadrado pero este tiene dos pares de lados iguales"+
                "\nSu fórmula es: "+this.getFormula()+"\n"+
                "La base que digitaste fue: "+this.getBase()+"\n"+
                "La altura que digitaste fue: "+this.getAltura()+"\n" +
                "Su área se ha calculado y es: "+this.getArea()+"\n"
        );
    }
}
