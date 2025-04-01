package Service;
import Modelo.Cliente;
import Modelo.Empleado;
import Modelo.Persona;
import java.util.ArrayList;
import java.util.List;

public class PersonaService {
    private List<Persona> personas = new ArrayList<>();

    public void agregarPersona(Persona persona){
        personas.add(persona);
    }

    public void mostrarDatos(){
        for (Persona a : personas){
            a.tipoPersona();
            System.out.println("Nombre: "+ a.getNombre()+"\n"+
                    "Edad: "+ a.getEdad()+" años."+"\n"+
                    "Dirección: "+ a.getDireccion());
            if (a instanceof Cliente){
                Cliente cliente = (Cliente) a;
                System.out.println("Número de cliente: "+ cliente.getNumcliente()+"\n"+
                    "Historial de las compras realizadas: "+
                    "\n"+ cliente.getHistorialCompras()+"\n");
            } else if (a instanceof Empleado) {
                Empleado empleado = (Empleado) a;
                System.out.println("El código que le pertenece por ser empleado es: "+ empleado.getCodigoEmpleado()+"\n"+
                        "Cargo que ocupa: "+ empleado.getCargo()+"\n"+
                        "Salario mensual: "+ empleado.getSalario()+"$"+"\n"+
                        "Aunque con bonos aumenta más :)\n");
            }
            a.lugar();
            System.out.println();
        }
    }
}
