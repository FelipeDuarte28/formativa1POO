/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formativa_desde_cero;

/**
 *
 * @author Felipe
 */

import java.time.LocalDate;
import java.time.Period;

public class Docente {
    private String rut;
    private String numeroDocente;
    private String nombreDocente;
    private LocalDate fechaIngreso;
    private String nombreSede;

    public Docente(String rut, String numeroDocente, String nombreDocente, LocalDate fechaIngreso, String nombreSede) {
        if (nombreDocente.isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
            return; // No continua con la creacion del objeto
        }
        
        LocalDate fechaActual = LocalDate.now();
        if (Period.between(fechaIngreso, fechaActual).getDays() <= 0) {
            System.out.println("Error: La fecha de ingreso debe ser antes de hoy.");
            return; // No continua con la creacion del objeto
        }
        
        this.rut = rut;
        this.numeroDocente = numeroDocente;
        this.nombreDocente = nombreDocente;
        this.fechaIngreso = fechaIngreso;
        this.nombreSede = nombreSede;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNumeroDocente() {
        return numeroDocente;
    }

    public void setNumeroDocente(String numeroDocente) {
        this.numeroDocente = numeroDocente;
    }

    public String getNombreDocente() {
        return nombreDocente;
    }

    public void setNombreDocente(String nombreDocente) {
        this.nombreDocente = nombreDocente;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public String getNombreSede() {
        return nombreSede;
    }

    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }

    
}
