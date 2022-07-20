/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ec.intsuperior.modelo;

/**
 *
 * @author kevin
 */
public class Empresa extends Persona {

    private String NombreEmpresa;

    public Empresa() {

    }

    public Empresa(String NombreEmpresa, String nombre, String nombre2, String apellido1, String apellido2, String ci, String telefono, String correo, String direccion, String fechadenacimiento, String suledomensual) {
        super(nombre, nombre2, apellido1, apellido2, ci, telefono, correo,direccion, fechadenacimiento, sueldomensual);
        this.NombreEmpresa = NombreEmpresa;

    }
    public void setNombreEmpresa(String NombreEmpresa){
        this.NombreEmpresa=NombreEmpresa;
       
      }
    public String getNombreempresa(){
        return NombreEmpresa;
        
        
        
    }

    @Override
    public String toString(); {
     return NombreEmpresa :"\n"
    +"el nombre de la empresa es:\n" +getNombreEmpresa();
}
   

}


