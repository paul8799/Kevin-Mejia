/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ecintsuperior.vista;

import edu.ec.intsuperior.modelo.Cliente;
import ec.edu.intsuperior.modelo.Directivo;
import edu.ec.intsuperior.modelo.Empleado;
import edu.ec.intsuperior.modelo.Persona;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Aplicacion {

    private static Object JOPtionPane;

    public static void main(String[] arga) {
        Scanner leer = new Scanner(System.in);
        Persona p1 = new Cliente();

        p1.setCi(JOptionPane.showInputDialog("ingrese el numero de cedula"));
        p1.setNombre(JOptionPane.showInputDialog("ingrese nombre1"));
        p1.setNombre2(JOptionPane.showInputDialog("ingrese nombre2"));
        p1.setApellido1(JOptionPane.showInputDialog("ingrese apellido"));
        p1.setApellido2(JOptionPane.showInputDialog("ingrese apellido2"));
        p1.setCorreo(JOptionPane.showInputDialog("ingrese correo"));
        p1.setDireccion(JOptionPane.showInputDialog("ingrese direccion"));
        p1.setTelefono(JOptionPane.showInputDialog("ingrese telefono"));
        p1.setFechadeNacimiento(JOptionPane.showInputDialog("ingrese edad"));
        {
           JOptionPane.showMessageDialog(null, p1.String());

        }
        String nombre = JOptionPane.showInputDialog("nombre del obrero");
        int dt = Integer.parseInt(JOptionPane.showInputDialog("dias laborados"));
        double pd = double.parseDouble
        (JOPtionPane.showInputDialog("pagos al dia")
        );
        
       double sb = 0, aux;

        if (dt > 30) {
            double tn = 15 * pd;

            double sx = (pd * 15);
            sb = sx + tn;
        } else {
            sb = dt * pd;

        }

        JOptionPane.showMessageDialog(null, JOPtionPane, +nombre + "/n"
                + "profesion: " + profesion + "\n"
                + "dias laborados: " + dt + "\n"
                + "Sueldo a ganar:" + sb + "\n");
    }
}
