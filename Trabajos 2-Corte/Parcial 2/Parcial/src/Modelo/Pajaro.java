package Modelo;

public class Pajaro extends Animal{
    private String tipoDeCanto;

    //Método constructor
    public Pajaro(String nombre, int edad, double peso, String tipoDeCanto) {
        super(nombre, edad, peso);
        this.tipoDeCanto = tipoDeCanto;
    }

    //Get y Set
    public String getTipoDeCanto() {
        return tipoDeCanto;
    }

    public void setTipoDeCanto(String tipoDeCanto) {
        this.tipoDeCanto = tipoDeCanto;
    }


    //Polimorfismo del método
    @Override
    public void hacerSonido(){
        System.out.println("El pájaro canta una linda melodía");
    }

    //Método propio de la clase
    public void volar(){
        System.out.println(getNombre()+" vuela por el campo");
    }
}
