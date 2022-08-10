package ec.edu.intsuperior.modelo;

import edu.ec.intsuperior.modelo.Persona;
import java.util.Date;

/**
 *
 * @author Santiago Solis
 */
public class Empleado extends Persona {
    private double sueldo;

    public Empleado() {
    }

    public Empleado(double sueldo, String nombre, String nombre2, String apellido1, String apellido2, String ci, String telefono, String correo, String direccion, String fechadenacimiento, String sueldomensual) {
        super(nombre, nombre2, apellido1, apellido2, ci, telefono, correo, direccion, fechadenacimiento, sueldomensual);
        this.sueldo = sueldo;
    }

  

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
    @Override
    public String toString() {
        return super.toString()+"\n"
                + "Sueldo" +getSueldo()+"\n"; //To change body of generated methods, choose Tools | Templates.
    }
    }
    
    

