package Modelo;

public abstract class Figura{
    private String nombre;
    private String formula;
    private double area;
    private double base;
    private double altura;

    //Set
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFormula(String formula){
        this.formula = formula;
    }
    public void setArea(double area){
        this.area = area;
    }
    public void setBase(double base){
        this.base = base;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    //Get
    public String getNombre(){
        return this.nombre;
    }
    public String getFormula(){
        return this.formula;
    }
    public double getArea(){
        return this.area;
    }
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
    //Implementación del método
    public void Mostrar(){
        System.out.println("Nombre de la figura: "+this.getNombre()+"\n" +
                "Fórmula del área: "+this.getFormula()+"\n"+
                "Base: "+this.getBase()+"\n" +
                "Altura: "+this.getAltura()+"\n"+
                "Área: "+this.getArea()+"\n"
        );
    }
    public void Mostrar2(){
        System.out.println("Nombre de la figura: "+this.getNombre()+"\n" +
                "Fórmula del área: "+this.getFormula()+"\n"+
                "Radio: "+this.getBase()+"\n"+
                "Área: "+this.getArea()+"\n"
        );
    }
}