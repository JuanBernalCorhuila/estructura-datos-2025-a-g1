import javax.swing.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class ValidarEdad {
    public static void main(String[] args) {
        //Definir variable
        Date fechaNacimiento;
        String nombre = "";

        String fechaStr = JOptionPane.showInputDialog(null, "Digite la fecha de nacimiento");
        SimpleDateFormat formato = new SimpleDateFormat("DD/mm/yyyy");
        formato.setLenient(false);

        try {

        }catch (ParseException e){
            //JOptionPane.showMessageDialog
        }
    }
}

