public class Usuario {
    protected String nombre;
    protected String email;

    public Usuario(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public void mostrarPerfil() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
    }
}

class Cliente extends Usuario {
    private int edad;

    public Cliente(String nombre, String email, int edad) {
        super(nombre, email);
        this.edad = edad;
    }

    @Override
    public void mostrarPerfil() {
        super.mostrarPerfil();
        System.out.println("Edad: " + edad + " años");
    }
}


class Administrador extends Usuario {
    private int contraseña;

    public Administrador(String nombre, String email, int contraseña) {
        super(nombre, email);
        this.contraseña = contraseña;
    }

    @Override
    public void mostrarPerfil() {
        super.mostrarPerfil();
        System.out.println("Contraseña: " + contraseña + " dígitos");
    }
}

//Vamos a probar el polimorfismo
class Prueba {
    public static void main(String[] args) {
        Cliente c = new Cliente("Juan", "juanm@gmail.com", 19);
        c.mostrarPerfil();

        System.out.println(); 

        Administrador a = new Administrador("Juan", "juanm@gmail.com", 8);
        a.mostrarPerfil();
    }
}
