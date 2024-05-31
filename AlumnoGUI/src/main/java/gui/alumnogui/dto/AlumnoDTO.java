/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui.alumnogui.dto;

import java.time.LocalDate;

/**
 *
 * @author g.guzman
 */
public class AlumnoDTO {
    private int dni;
    private String nombre;
    private LocalDate fecNac;
    private int legajo;
    private short cantMatAprob;
    private double promedio;
    private LocalDate fechaIng;
    private char estado = 'A';

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public short getCantMatAprob() {
        return cantMatAprob;
    }

    public void setCantMatAprob(short cantMatAprob) {
        this.cantMatAprob = cantMatAprob;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public LocalDate getFechaIng() {
        return fechaIng;
    }

    public void setFechaIng(LocalDate fechaIng) {
        this.fechaIng = fechaIng;
    }

    public char getEstado() {
        return estado;
    }

    public void setEstado(char estado) {
        this.estado = estado;
    }
    
    public LocalDate getFecNac() {
        return fecNac;
    }

    public void setFecNac(LocalDate fecNac) {
        this.fecNac = fecNac;
    }
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
