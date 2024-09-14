/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package formativa_desde_cero;

/**
 *
 * @author Felipe
 */
import java.time.LocalDate;

public class Formativa_desde_cero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Estudiante estudiante1 = new Estudiante("12345678-9", "Amalia Nunes", LocalDate.of(2002, 9, 11));
        Docente docente1 = new Docente("11111111-1", "100101", "Juan Soto", LocalDate.of(2023, 9, 13), "Antonio Varas");
        
        Asignatura curso1 = new Asignatura("MAT0101", "Matematica Aplicada", estudiante1, docente1, 1.0f, 5.8f, 4.5f);

        System.out.println("Nombre curso: "+curso1.getNombre());
        System.out.println("Nombre estudiante: "+curso1.getEstudiante().getNombre());
        System.out.println("Nota presentacion: "+curso1.getNotaPresentacion());
        System.out.println("Nota examen: "+curso1.getNotaExamen());
        System.out.println("Nota final: "+curso1.getNotaFinal());
        System.out.println("Estado: "+curso1.getEstado());
        System.out.println("-------------------");
        
        curso1.cerrarAsignatura(1.0f);
        
        System.out.println("Nombre curso: "+curso1.getNombre());
        System.out.println("Nombre estudiante: "+curso1.getEstudiante().getNombre());
        System.out.println("Nota presentacion: "+curso1.getNotaPresentacion());
        System.out.println("Nota examen: "+curso1.getNotaExamen());
        System.out.println("Nota final: "+curso1.getNotaFinal());
        System.out.println("Estado: "+curso1.getEstado());
        System.out.println("-------------------");
    }
    
}
