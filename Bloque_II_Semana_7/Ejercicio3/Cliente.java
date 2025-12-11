package Bloque_II_Semana_7.Ejercicio3;

import java.io.Serializable;

/**
 * Representa un cliente del banco.
 */
public class Cliente implements Serializable {
    private static final long serialVersionUID = 1L;

    private String nombre;
    private String dni;
    private String email;

    public Cliente(String nombre, String dni, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Cliente)) return false;
        Cliente otro = (Cliente) obj;
        return dni.equalsIgnoreCase(otro.getDni());
    }

    @Override
    public String toString() {
        return nombre + " (" + dni + ")";
    }
}
