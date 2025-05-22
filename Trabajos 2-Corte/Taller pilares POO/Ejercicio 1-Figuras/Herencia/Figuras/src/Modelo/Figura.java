package Modelo;

public class Figura{
    private String nombre;
    private String formula;
    private double area;
    private double base;
    private double altura;

    //Implementación del método
    public void Mostrar(){
        this.nombre = "Triángulo";
        this.formula = "(Base*altura)/2";
        this.base = 2;
        this.altura = 8;
        this.area = (base*altura)/2;
        System.out.println("Nombre de la figura: "+this.nombre+"\n" +
                        "Fórmula del área: "+this.formula+"\n"+
                        "Base: "+this.base+"\n"+
                        "Altura: "+this.altura+"\n"+
                        "Área = "+this.area+"\n");
    }
}

