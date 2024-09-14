/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formativa_desde_cero;

/**
 *
 * @author Felipe
 */
public class Sede {
    private String nro_unico, nombre_sede, comuna;

    public Sede(String nro_unico, String nombre_sede, String comuna) {
        this.nro_unico = nro_unico;
        this.nombre_sede = nombre_sede;
        this.comuna = comuna;
    }

    public String getNro_unico() {
        return nro_unico;
    }

    public void setNro_unico(String nro_unico) {
        this.nro_unico = nro_unico;
    }

    public String getNombre_sede() {
        return nombre_sede;
    }

    public void setNombre_sede(String nombre_sede) {
        this.nombre_sede = nombre_sede;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }
    
}
