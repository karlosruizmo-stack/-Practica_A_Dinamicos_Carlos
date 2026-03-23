public class Tarea {
    private String nombre;
    private String autor;
    private String descripcion;
    private int duracionMinutos;
    private String estado;

    public Tarea(String nombre, String autor, String descripcion, int duracionMinutos, String estado) {
        this.nombre = nombre;
        this.autor = autor;
        this.descripcion = descripcion;
        this.duracionMinutos = duracionMinutos;
        this.estado = estado;
    }

    public String getNombre() { return nombre; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return String.format("| %-15s | %-12s | %-10d min | %-12s | %-20s",
                nombre, autor, duracionMinutos, estado, descripcion);
    }
}
