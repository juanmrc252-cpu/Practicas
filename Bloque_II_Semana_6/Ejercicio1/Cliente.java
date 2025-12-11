package Bloque_II_Semana_6.Ejercicio1;

/**
 * Representa un cliente de un banco.
 * Contiene información básica como nombre, DNI y correo electrónico.
 * 
 * @author Juan
 * @version 1.0
 */
public class Cliente {

    private String nombre;
    private String dni;
    private String email;

    /**
     * Constructor de Cliente.
     * 
     * @param nombre Nombre completo del cliente
     * @param dni DNI del cliente
     * @param email Correo electrónico del cliente
     */
    public Cliente(String nombre, String dni, String email) {
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
    }

    /**
     * Devuelve el nombre del cliente.
     * 
     * @return nombre del cliente
     */
    public String getNombre() { return nombre; }

    /**
     * Devuelve el DNI del cliente.
     * 
     * @return DNI del cliente
     */
    public String getDni() { return dni; }

    /**
     * Devuelve el correo electrónico del cliente.
     * 
     * @return email del cliente
     */
    public String getEmail() { return email; }

    /**
     * Establece el nombre del cliente.
     * 
     * @param nombre Nuevo nombre
     */
    public void setNombre(String nombre) { this.nombre = nombre; }

    /**
     * Establece el DNI del cliente.
     * 
     * @param dni Nuevo DNI
     */
    public void setDni(String dni) { this.dni = dni; }

    /**
     * Establece el correo electrónico del cliente.
     * 
     * @param email Nuevo email
     */
    public void setEmail(String email) { this.email = email; }

    /**
     * Compara dos clientes por su DNI.
     * 
     * @param obj Otro objeto a comparar
     * @return true si los DNIs son iguales, false en caso contrario
     */
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
