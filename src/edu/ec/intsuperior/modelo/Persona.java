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
public class Persona {

  private String nombre;
  private String nombre2;
  private String apellido1;
  private String apellido2;
  private String ci;
  private String telefono;
  private String correo;
  private String direccion;
  private String fechadenacimiento;
  private String sueldomensual;
  
  public Persona (){
      
  }
  public Persona(String nombre,String nombre2,String apellido1,String apellido2,String ci,String telefono,String correo,String direccion,String fechadenacimiento,String sueldomensual){
      this.nombre = nombre;
      this.nombre2 = nombre2;
      this.apellido1 = apellido1;
      this.apellido2 = apellido2;
      this.ci = ci;
      this.telefono = telefono;
      this.correo = correo;
      this.direccion = direccion;
      this.fechadenacimiento = fechadenacimiento;
      this.sueldomensual = sueldomensual;
  }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public void setSueldomensual(String sueldomensual) {
        this.sueldomensual = sueldomensual;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNombre2() {
        return nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getCi() {
        return ci;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public String getSueldomensual() {
        return sueldomensual;
    }
    @Override
    public String toString() {
       
     return "Los tipos de datos son: \n "
                + "cedula: "+getCi()+"\n"
                +"apellidos y nombres : "+getApellido1()+" "+getApellido2()+
                " "+getNombre()+" "+getNombre2()+"\n"
                + "Direcion: "+getDireccion()+"\n"
                +"Celular: "+getTelefono()+"\n"
                +"Correo: "+getCorreo()+"\n"
                +"Edad: "+getFechadenacimiento()+"\n";
   } 
 }


