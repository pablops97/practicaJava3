/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p03;

import com.mycompany.p03.Fecha;

/**
 *
 * @author ConoMaster
 */
public class Empleado {
    
    private String nombre;
    private String apellidos;
    private String dni;
    private Fecha fechaAlta;
   
    public Empleado( String nombre, int dia, int mes, int anio){
        
        this.nombre = nombre;
        this.apellidos = null;
        this.dni = null;
        this.fechaAlta = new Fecha(dia,mes,anio);
    }
    
    public Empleado( String nombre, int dia, int mes, int anio, String apellidos, String dni){
        this(nombre, dia, mes, anio);
        this.apellidos = apellidos;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Fecha getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Fecha fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    @Override
    public String toString() {
        return fechaAlta.getDia()+"/"+fechaAlta.getMes()+"/"+fechaAlta.getAnio();
    }
  
}
