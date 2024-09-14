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

public class Estudiante {
    private String rut;
    private String nombre;
    private LocalDate fechaNacimiento;
    private int edad;

    public Estudiante(String rut, String nombre, LocalDate fechaNacimiento) {
        if (nombre.isEmpty()) {
            System.out.println("Error: El nombre no puede estar vacío.");
            return; // No continua con la creacion del objeto
        }
        
        int edadCalculada = calcularEdad(fechaNacimiento);
        if (edadCalculada < 18 || edadCalculada >= 100) {
            System.out.println("Error: La edad debe estar entre 18 y 99 años.");
            return; // No continua con la creacion del objeto
        }
        
        this.rut = rut;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edadCalculada;
    }
    
    private int calcularEdad(LocalDate fechaNacimiento) {
        LocalDate fechaActual = LocalDate.now();
        return Period.between(fechaNacimiento, fechaActual).getYears();
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}

