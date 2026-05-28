import java.util.Scanner;

class Mamifero {
    private String nombre;
    private String raza;
    private String fechaNacimiento;
    private float peso;

    public Mamifero(String nombre, String raza, String fechaNacimiento, float peso) {
        this.nombre = nombre;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
    }

    public void comer() {
        System.out.println(nombre + " está comiendo.");
    }

    public void comunicarse() {
        System.out.println(nombre + " se está comunicando.");
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Peso: " + peso);
    }

    public String getNombre() {
        return nombre;
    }
}