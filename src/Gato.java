class Gato extends Mamifero {
    private double alturaSalto;

    public Gato(String nombre, String raza, String fechaNacimiento, float peso, double alturaSalto) {
        super(nombre, raza, fechaNacimiento, peso);
        this.alturaSalto = alturaSalto;
    }

    @Override
    public void comunicarse() {
        System.out.println(getNombre() + " dice: miau miau");
    }

    public void mostrarDatosGato() {
        mostrarDatos();
        System.out.println("Altura de salto: " + alturaSalto);
    }
}