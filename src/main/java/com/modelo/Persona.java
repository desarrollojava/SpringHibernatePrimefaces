/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {

    private int idPersona;
    private String nombres;
    private int apellidos;
    private int direccionDomicilio;

    @Id
    @Column(name = "idPersona", unique = true, nullable = false)
    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    @Column(name = "nombres", unique = true, nullable = false)
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Column(name = "apellidos", unique = true, nullable = false)
    public int getApellidos() {
        return apellidos;
    }

    public void setApellidos(int apellidos) {
        this.apellidos = apellidos;
    }

    @Column(name = "direccionDomicilio", unique = true, nullable = false)
    public int getDireccionDomicilio() {
        return direccionDomicilio;
    }

    public void setDireccionDomicilio(int direccionDomicilio) {
        this.direccionDomicilio = direccionDomicilio;
    }

}
