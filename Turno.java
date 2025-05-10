public class Turno {
    private static int contador = 1;
    private int id;
    private String nombre;

    public Turno(String nombre) {
        this.id = contador++;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    
    public String toString() {
        return "Turno #" + id + " - " + nombre;
    }
}