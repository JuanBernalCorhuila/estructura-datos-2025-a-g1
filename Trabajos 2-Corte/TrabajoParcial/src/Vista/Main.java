package Vista;
import Modelo.Perro;
import Modelo.Gato;
import Modelo.Pajaro;
import Modelo.Conejo;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro("", 0,0, "");
        Perro perro2 = new Perro("", 0,0, "");
        Perro perro3 = new Perro("", 0,0, "");

        Gato gato1 = new Gato("",0, 0, "");
        Gato gato2 = new Gato("",0, 0, "");
        Gato gato3 = new Gato("",0, 0, "");

        Pajaro pajaro1 = new Pajaro("",0,0,"");
        Pajaro pajaro2 = new Pajaro("",0,0,"");
        Pajaro pajaro3 = new Pajaro("",0,0,"");

        Conejo conejo1 = new Conejo("",0, 0, 0);
        Conejo conejo2 = new Conejo("",0, 0, 0);
        Conejo conejo3 = new Conejo("",0, 0, 0);

        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                    "Bienvenidos a PetWorld, que desea hacer: "+
                    "\n1.Registrar información perros."+
                    "\n2.Registrar información gatos."+
                    "\n3.Registrar información pájaros."+
                    "\n4.Registrar información conejos."+
                    "\n5.Mostrar información."+
                    "\n6.Salir."));
            switch (opcion){
                case 1:
                    perro1.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el nombre del primer perro: "));
                    perro1.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    perro1.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    perro1.setRaza(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la raza del perro: "));

                    perro2.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el nombre del segundo perro: "));
                    perro2.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    perro2.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    perro2.setRaza(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la raza del perro: "));

                    perro3.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el nombre del tercer perro: "));
                    perro3.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    perro3.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    perro3.setRaza(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la raza del perro: "));

                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    break;
                case 2:
                    gato1.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el nombre del primer gato: "));
                    gato1.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    gato1.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    gato1.setColorPelaje(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el color del gato: "));

                    gato2.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el nombre del segundo gato: "));
                    gato2.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    gato2.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    gato2.setColorPelaje(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el color del gato: "));

                    gato3.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el nombre del tercer gato: "));
                    gato3.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    gato3.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    gato3.setColorPelaje(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el color del gato: "));

                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    break;

                case 3:
                    pajaro1.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el nombre del primer pájaro: "));
                    pajaro1.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    pajaro1.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    pajaro1.setTipoDeCanto(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el canto del pájaro: "));

                    pajaro2.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el nombre del segundo pájaro: "));
                    pajaro2.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    pajaro2.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    pajaro2.setTipoDeCanto(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el canto del pájaro: "));

                    pajaro3.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el nombre del tercer pájaro: "));
                    pajaro3.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    pajaro3.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    pajaro3.setTipoDeCanto(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el canto del pájaro: "));

                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    break;

                case 4:
                    conejo1.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el nombre del primer conejo: "));
                    conejo1.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    conejo1.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    conejo1.setLongitudDeOrejas(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el largo de las orejas del conejo: ")));

                    conejo2.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el nombre del segundo conejo: "));
                    conejo2.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    conejo2.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    conejo2.setLongitudDeOrejas(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el largo de las orejas del conejo: ")));

                    conejo3.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el nombre del tercer conejo: "));
                    conejo3.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    conejo3.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    conejo3.setLongitudDeOrejas(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el largo de las orejas del conejo: ")));

                    JOptionPane.showMessageDialog(null, "Registro exitoso");
                    break;

                case 5:
                    int opcion1 = 0;
                    opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "1.Mostrar información perros"+
                            "\n2.Mostrar información gatos"+
                            "\n3.Mostrar información pájaros"+
                            "\n4.Mostrar información conejos"));
                    switch(opcion1){
                        case 1:
                            System.out.println("PERROS");
                            System.out.println("PERRO 1");
                            perro1.mostrarInformacion();
                            perro1.animalJoven();
                            System.out.println(perro1.getNombre()+ "es de la raza "+perro1.getRaza());
                            perro1.jugar();
                            perro1.hacerSonido();

                            System.out.println("\nPERRO 2");
                            perro2.mostrarInformacion();
                            perro2.animalJoven();
                            System.out.println(perro2.getNombre()+ "es de la raza "+perro2.getRaza());
                            perro2.jugar();
                            perro2.hacerSonido();

                            System.out.println("\nPERRO 3");
                            perro3.mostrarInformacion();
                            perro3.animalJoven();
                            System.out.println(perro3.getNombre()+ "es de la raza "+perro3.getRaza());
                            perro3.jugar();
                            perro3.hacerSonido();
                            break;

                        case 2:
                            System.out.println("GATOS");
                            System.out.println("GATO 1");
                            gato1.mostrarInformacion();
                            gato1.animalJoven();
                            System.out.println(gato1.getNombre()+ "es de color "+gato1.getColorPelaje());
                            gato1.ronronear();
                            gato1.hacerSonido();

                            System.out.println("\nGATO 2");
                            gato2.mostrarInformacion();
                            gato2.animalJoven();
                            System.out.println(gato2.getNombre()+ "es de color "+gato2.getColorPelaje());
                            gato2.ronronear();
                            gato2.hacerSonido();

                            System.out.println("\nGATO 3");
                            gato3.mostrarInformacion();
                            gato3.animalJoven();
                            System.out.println(gato3.getNombre()+ "es de color "+gato3.getColorPelaje());
                            gato3.ronronear();
                            gato3.hacerSonido();
                            break;

                        case 3:
                            System.out.println("PÁJAROS");
                            System.out.println("PÁJARO 1");
                            pajaro1.mostrarInformacion();
                            pajaro1.animalJoven();
                            System.out.println(pajaro1.getNombre()+ " su canto es:  "+pajaro1.getTipoDeCanto());
                            pajaro1.volar();
                            pajaro1.hacerSonido();

                            System.out.println("\nPÁJARO 2");
                            pajaro2.mostrarInformacion();
                            pajaro2.animalJoven();
                            System.out.println(pajaro2.getNombre()+ " su canto es:  "+pajaro2.getTipoDeCanto());
                            pajaro2.volar();
                            pajaro2.hacerSonido();

                            System.out.println("\nPÁJARO 3");
                            pajaro3.mostrarInformacion();
                            pajaro3.animalJoven();
                            System.out.println(pajaro3.getNombre()+ " su canto es:  "+pajaro3.getTipoDeCanto());
                            pajaro3.volar();
                            pajaro3.hacerSonido();
                            break;
                        case 4:
                            System.out.println("CONEJOS");
                            System.out.println("CONEJO 1");
                            conejo1.mostrarInformacion();
                            conejo1.animalJoven();
                            System.out.println(conejo1.getNombre()+ " tiene orejas con una longitud de "+conejo1.getLongitudDeOrejas());
                            conejo1.saltar();
                            conejo1.hacerSonido();

                            System.out.println("\nCONEJO 2");
                            conejo2.mostrarInformacion();
                            conejo2.animalJoven();
                            System.out.println(conejo2.getNombre()+ " tiene orejas con una longitud de "+conejo2.getLongitudDeOrejas());
                            conejo2.saltar();
                            conejo2.hacerSonido();

                            System.out.println("\nCONEJO 3");
                            conejo3.mostrarInformacion();
                            conejo3.animalJoven();
                            System.out.println(conejo3.getNombre()+ " tiene orejas con una longitud de "+conejo3.getLongitudDeOrejas());
                            conejo3.saltar();
                            conejo3.hacerSonido();
                            break;
                        default:
                            if(opcion1<1 || opcion1>4){
                                JOptionPane.showMessageDialog(null, "ERROR OPCIÓN INCORRECTA");
                            }else{
                            }
                            break;


                    }
                default:
                    if(opcion<1 || opcion>6){
                        JOptionPane.showMessageDialog(null, "ERROR OPCIÓN INCORRECTA");
                    }else{
                    }
                    break;

            }

        }while(opcion!=6);
    }
}
