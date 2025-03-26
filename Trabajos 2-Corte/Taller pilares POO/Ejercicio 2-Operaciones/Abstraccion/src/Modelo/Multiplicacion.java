package Modelo;

public class Multiplicacion extends Operaciones{
    private String propiedad;

    public String getPropiedad(){
        return propiedad;
    }

    public void setPropiedad(String propiedad){
        this.propiedad = propiedad;
    }

    @Override
    public void Visualizar(){
        System.out.println("La "+this.getNombre()+" es una operación aritmética."+"\n"+
                "\nLa multiplicación tiene 4 propiedades.\n"+
                "Una de ellas es la propiedad: "+this.getPropiedad()+"\n"+
                "\nSu operador es: "+this.getOperador()+"\n"+
                "Digitaste como primer número: "+this.getNum1()+" y como segundo el: "+this.getNum2()+"\n"+
                "Resultado = "+this.getResultado()+"\n");
    }
}