/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formativa_desde_cero;

/**
 *
 * @author Felipe
 */
public class Asignatura {
    private String codigo;
    private String nombre;
    private Estudiante estudiante;
    private Docente docente;
    private float nota1;
    private float nota2;
    private float nota3;
    private float notaPresentacion;
    private float notaExamen;
    private float notaFinal;
    private String estado;

    // Constructor que no llama a métodos overridable directamente
    public Asignatura(String codigo, String nombre, Estudiante estudiante, Docente docente, float nota1, float nota2, float nota3) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.estudiante = estudiante;
        this.docente = docente;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        
        // Llama a un método privado o final para evitar la advertencia
        this.notaPresentacion = calcularNotaPresentacionInterno();
        this.estado = estaEximidoInterno() ? "Eximido" : "No eximido, requiere examen";
    }

    // Métodos privados que no pueden ser sobrescritos
    private float calcularNotaPresentacionInterno() {
        return (nota1 * 0.3f) + (nota2 * 0.3f) + (nota3 * 0.4f);
    }

    private boolean estaEximidoInterno() {
        if (calcularNotaPresentacionInterno() >= 5.0f){
            this.notaExamen = notaPresentacion;
            this.notaFinal = notaPresentacion;
            return true;
        } else {
            return false;
        }
    }

    // Método público que puede ser llamado fuera del constructor (creo que no es tan necesario)
    public float calcularNotaPresentacion() {
        return calcularNotaPresentacionInterno();
    }

    public boolean estaEximido() {
        return estaEximidoInterno();
    }
    
    public void cerrarAsignatura(float notaExamen) {
        if (this.notaPresentacion >= 5.0f) {
        } else {
            this.notaExamen = notaExamen;
            this.notaFinal = calcularNotaFinal();
            this.estado = notaFinal >= 4.0f ? "Aprobado" : "Reprobado";
        }
    }

    public float calcularNotaFinal() {
        return (notaPresentacion * 0.6f) + (notaExamen * 0.4f);
    }

    public String getEstado() {
        return estado;
    }

    public String getEstudianteNombre() {
        return estudiante.getNombre();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public float getNota3() {
        return nota3;
    }

    public void setNota3(float nota3) {
        this.nota3 = nota3;
    }

    public float getNotaPresentacion() {
        return notaPresentacion;
    }

    public void setNotaPresentacion(float notaPresentacion) {
        this.notaPresentacion = notaPresentacion;
    }

    public float getNotaExamen() {
        return notaExamen;
    }

    public void setNotaExamen(float notaExamen) {
        this.notaExamen = notaExamen;
    }

    public float getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(float notaFinal) {
        this.notaFinal = notaFinal;
    }
    
}
