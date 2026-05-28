import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Datos del perro ===");

        System.out.print("Nombre: ");
        String nombrePerro = sc.nextLine();

        System.out.print("Raza: ");
        String razaPerro = sc.nextLine();

        System.out.print("Fecha de nacimiento: ");
        String fechaPerro = sc.nextLine();

        System.out.print("Peso: ");
        float pesoPerro = Float.parseFloat(sc.nextLine());

        System.out.print("Lugar de entrenamiento: ");
        String lugarEntrenamiento = sc.nextLine();

        Perro perro = new Perro(
                nombrePerro,
                razaPerro,
                fechaPerro,
                pesoPerro,
                lugarEntrenamiento
        );

        System.out.println();

        System.out.println("=== Datos del gato ===");

        System.out.print("Nombre: ");
        String nombreGato = sc.nextLine();

        System.out.print("Raza: ");
        String razaGato = sc.nextLine();

        System.out.print("Fecha de nacimiento: ");
        String fechaGato = sc.nextLine();

        System.out.print("Peso: ");
        float pesoGato = Float.parseFloat(sc.nextLine());

        System.out.print("Altura de salto: ");
        double alturaSalto = Double.parseDouble(sc.nextLine());

        Gato gato = new Gato(
                nombreGato,
                razaGato,
                fechaGato,
                pesoGato,
                alturaSalto
        );

        System.out.println();
        System.out.println("=== Información del perro ===");
        perro.mostrarDatosPerro();
        perro.comer();
        perro.comunicarse();

        System.out.println();
        System.out.println("=== Información del gato ===");
        gato.mostrarDatosGato();
        gato.comer();
        gato.comunicarse();
        }
    }