package Bloque_II_Semana_5.Ejercicio2;

public class Cliente {

    private String nombre;
    private String dni;
    private String email;

    public Cliente(String nombre, String dni, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public String getEmail() { return email; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDni(String dni) { this.dni = dni; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cliente otro = (Cliente) obj;
        return dni.equalsIgnoreCase(otro.dni);
    }

    @Override
    public int hashCode() {
        return dni.toLowerCase().hashCode();
    }

    @Override
    public String toString() {
        return nombre + " (" + dni + ") - " + email;
    }
}
