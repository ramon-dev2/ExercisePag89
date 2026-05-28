class Perro extends Mamifero {
    private String lugarEntrenamiento;

    public Perro(String nombre, String raza, String fechaNacimiento, float peso, String lugarEntrenamiento) {
        super(nombre, raza, fechaNacimiento, peso);
        this.lugarEntrenamiento = lugarEntrenamiento;
    }

    @Override
    public void comunicarse() {
        System.out.println(getNombre() + " dice: guau guau");
    }

    public void mostrarDatosPerro() {
        mostrarDatos();
        System.out.println("Lugar de entrenamiento: " + lugarEntrenamiento);
    }
}