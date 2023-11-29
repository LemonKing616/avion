public class Avion {
    private String nombre;
    private Gasolina gasolina;
    private Revision revision;

    public Avion(String nombre, Gasolina gasolina, Revision revision) {
        this.nombre = nombre;
        this.gasolina = gasolina;
        this.revision = revision;
    }

    public void mostrarDatos() {
        System.out.println("Datos del avión:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Gasolina: " + gasolina.getCantidadLitros() + " litros");
        System.out.println("Meses restantes para revisión: " + revision.getMesesRestantes() + " meses");
    }

    public static void main(String[] args) {
        // Crear objetos de las clases Gasolina y Revision
        Gasolina gasolinaAvion1 = new Gasolina(45);
        Revision revisionAvion1 = new Revision(5);

        // Crear objeto de la clase Avion
        Avion avion1 = new Avion("1", gasolinaAvion1, revisionAvion1);

        // Mostrar datos del avión
        avion1.mostrarDatos();
    }
}
