public class Nodo {

    private int codigo;
    private String nombre;
    private Nodo siguiente;

    Nodo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.siguiente = null;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
