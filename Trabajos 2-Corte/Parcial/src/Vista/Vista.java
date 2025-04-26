package Vista;
import Modelo.Perro;
import Modelo.Gato;
import Modelo.Pajaro;
import Modelo.Conejo;

import javax.swing.*;

public class Vista {
    public static void main(String[] args) {
        //Creaación de objetos
        Perro perro01 = new Perro("", 0, 0, "");
        Perro perro02 = new Perro("", 0, 0, "");
        Perro perro03 = new Perro("", 0, 0, "");

        Gato gato01 = new Gato("", 0, 0, "");
        Gato gato02 = new Gato("", 0, 0, "");
        Gato gato03 = new Gato("", 0, 0, "");

        Pajaro pajaro01 = new Pajaro("", 0, 0, "");
        Pajaro pajaro02 = new Pajaro("", 0, 0, "");
        Pajaro pajaro03 = new Pajaro("", 0, 0, "");

        Conejo conejo01 = new Conejo("", 0, 0, 0);
        Conejo conejo02 = new Conejo("", 0, 0, 0);
        Conejo conejo03 = new Conejo("", 0, 0, 0);

        int opcion = 0;

        //ciclo do-while
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                    "Bienvenido al menú de PetWorld, que desea hacer el día de hoy: \n"+
                    "\n1.Registrar información del perro"+
                    "\n2.Registrar información del Gato"+
                    "\n3.Registrar información del pájaro"+
                    "\n4.Registrar información del conejo"+
                    "\n5.Mostrar información de los animales"+
                    "\n6.Salir"));
            //Switch para hacer el menú iteractivo
            switch (opcion){
                case 1:
                    //Registrar info de cada objeto
                    perro01.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Digite el nombre del primer perro: "));
                    perro01.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    perro01.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    perro01.setRaza(JOptionPane.showInputDialog(null, ""+
                            "Digite la raza: "));

                    perro02.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Digite el nombre del segundo perro: "));
                    perro02.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    perro02.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    perro02.setRaza(JOptionPane.showInputDialog(null, ""+
                            "Digite la raza: "));

                    perro03.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Digite el nombre del tercer perro: "));
                    perro03.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    perro03.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    perro03.setRaza(JOptionPane.showInputDialog(null, ""+
                            "Digite la raza: "));

                    JOptionPane.showMessageDialog(null, "Información registrada con éxito!!!!");
                    break;
                case 2:
                    //Registrar info de cada objeto
                    gato01.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Digite el nombre del primer gato: "));
                    gato01.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    gato01.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    gato01.setColorPelaje(JOptionPane.showInputDialog(null, ""+
                            "Digite el color de pelaje: "));

                    gato02.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Digite el nombre del segundo gato: "));
                    gato02.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    gato02.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    gato02.setColorPelaje(JOptionPane.showInputDialog(null, ""+
                            "Digite el color de pelaje: "));

                    gato03.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Digite el nombre del tercer gato: "));
                    gato03.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    gato03.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    gato03.setColorPelaje(JOptionPane.showInputDialog(null, ""+
                            "Digite el color de pelaje: "));

                    JOptionPane.showMessageDialog(null, "Información registrada con éxito!!!!");
                    break;
                case 3:
                    //Registrar info de cada objeto
                    pajaro01.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Digite el nombre del primer pájaro: "));
                    pajaro01.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    pajaro01.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    pajaro01.setTipoDeCanto(JOptionPane.showInputDialog(null, ""+
                            "Digite el tipo de canto del pájaro: "));

                    pajaro02.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Digite el nombre del segundo pájaro: "));
                    pajaro02.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    pajaro02.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    pajaro02.setTipoDeCanto(JOptionPane.showInputDialog(null, ""+
                            "Digite el tipo de canto del pájaro: "));

                    pajaro03.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Digite el nombre del tercer pájaro: "));
                    pajaro03.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    pajaro03.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    pajaro03.setTipoDeCanto(JOptionPane.showInputDialog(null, ""+
                            "Digite el tipo de canto del pájaro: "));

                    JOptionPane.showMessageDialog(null, "Información registrada con éxito!!!!");
                    break;
                case 4:
                    //Registrar info de cada objeto
                    conejo01.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Digite el nombre del primer conejo: "));
                    conejo01.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    conejo01.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    conejo01.setLongitudOrejas(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Digite la longitud de las orejas del conejo: ")));

                    conejo02.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Digite el nombre del segundo conejo: "));
                    conejo02.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    conejo02.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    conejo02.setLongitudOrejas(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Digite la longitud de las orejas del conejo: ")));

                    conejo03.setNombre(JOptionPane.showInputDialog(null, ""+
                            "Digite el nombre del tercer conejo: "));
                    conejo03.setEdad(Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "Ingrese la edad: ")));
                    conejo03.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Ingrese el peso: ")));
                    conejo03.setLongitudOrejas(Double.parseDouble(JOptionPane.showInputDialog(null, ""+
                            "Digite la longitud de las orejas del conejo: ")));

                    JOptionPane.showMessageDialog(null, "Información registrada con éxito!!!!");
                    break;
                case 5:
                    int escoger = 0;
                    escoger = Integer.parseInt(JOptionPane.showInputDialog(null, ""+
                            "1.Mostrar información de los perros"+
                            "\n2.Mostrar información de los gatos"+
                            "\n3.Mostrar información de los pájaros"+
                            "\n4.Mostrar información de los conejos"));
                    //Switch para el menu interactivo
                    switch (escoger){
                        case 1:
                            //Mostrar información
                            System.out.println("-----PERROS-----");
                            System.out.println("|PERRO 1|");
                            perro01.mostrarInformacion();
                            perro01.animalEdad();
                            System.out.println(perro01.getNombre()+" es de raza "+perro01.getRaza());
                            perro01.jugar();
                            perro01.hacerSonido();

                            System.out.println("\n|PERRO 2|");
                            perro02.mostrarInformacion();
                            perro02.animalEdad();
                            System.out.println(perro02.getNombre()+" es de raza "+perro02.getRaza());
                            perro02.jugar();
                            perro02.hacerSonido();

                            System.out.println("\n|PERRO 3|");
                            perro03.mostrarInformacion();
                            perro03.animalEdad();
                            System.out.println(perro03.getNombre()+" es de raza "+perro03.getRaza());
                            perro03.jugar();
                            perro03.hacerSonido();
                            break;
                        case 2:
                            //Mostrar información
                            System.out.println("-----GATOS-----");
                            System.out.println("|Gato 1|");
                            gato01.mostrarInformacion();
                            gato01.animalEdad();
                            System.out.println(gato01.getNombre()+" es de color "+gato01.getColorPelaje());
                            gato01.ronronear();
                            gato01.hacerSonido();

                            System.out.println("\n|Gato 2|");
                            gato02.mostrarInformacion();
                            gato02.animalEdad();
                            System.out.println(gato02.getNombre()+" es de color "+gato02.getColorPelaje());
                            gato02.ronronear();
                            gato02.hacerSonido();

                            System.out.println("\n|Gato 3|");
                            gato03.mostrarInformacion();
                            gato03.animalEdad();
                            System.out.println(gato03.getNombre()+" es de color "+gato03.getColorPelaje());
                            gato03.ronronear();
                            gato03.hacerSonido();
                            break;
                        case 3:
                            //Mostrar información
                            System.out.println("-----PÁJAROS-----");
                            System.out.println("|Pajáro 1|");
                            pajaro01.mostrarInformacion();
                            pajaro01.animalEdad();
                            System.out.println(pajaro01.getNombre()+" tiene canto "+pajaro01.getTipoDeCanto());
                            pajaro01.volar();
                            pajaro01.hacerSonido();

                            System.out.println("\n|Pajáro 2|");
                            pajaro02.mostrarInformacion();
                            pajaro02.animalEdad();
                            System.out.println(pajaro02.getNombre()+" tiene canto "+pajaro02.getTipoDeCanto());
                            pajaro02.volar();
                            pajaro02.hacerSonido();

                            System.out.println("\n|Pajáro 3|");
                            pajaro03.mostrarInformacion();
                            pajaro03.animalEdad();
                            System.out.println(pajaro03.getNombre()+" tiene canto "+pajaro03.getTipoDeCanto());
                            pajaro03.volar();
                            pajaro03.hacerSonido();
                            break;
                        case 4:
                            //Mostrar información
                            System.out.println("-----CONEJOS-----");
                            System.out.println("|CONEJO 1|");
                            conejo01.mostrarInformacion();
                            conejo01.animalEdad();
                            System.out.println(conejo01.getNombre()+" tiene orejas de "+conejo01.getLongitudOrejas()+"cm");
                            conejo01.saltar();
                            conejo01.hacerSonido();

                            System.out.println("\n|CONEJO 2|");
                            conejo02.mostrarInformacion();
                            conejo02.animalEdad();
                            System.out.println(conejo02.getNombre()+" tiene orejas de "+conejo02.getLongitudOrejas()+"cm");
                            conejo02.saltar();
                            conejo02.hacerSonido();

                            System.out.println("\n|CONEJO 3|");
                            conejo03.mostrarInformacion();
                            conejo03.animalEdad();
                            System.out.println(conejo03.getNombre()+" tiene orejas de "+conejo03.getLongitudOrejas()+"cm");
                            conejo03.saltar();
                            conejo03.hacerSonido();
                            break;
                        default:
                            if(escoger<1 || escoger>4) {
                                JOptionPane.showMessageDialog(null, "OPCIÓN INVÁLIDA");
                            }else{
                            }
                            break;
                    }
                default:
                    if(opcion<0 || opcion>6) {
                        JOptionPane.showMessageDialog(null, "Digite una opción válida");
                    }else{
                    }
                    break;
            }
        }while(opcion != 6);
    }
}
