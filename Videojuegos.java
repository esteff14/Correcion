public class Videojuegos {
    String nombre;
    String tipo;

    public Videojuegos(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void imprimirVideojuego(){
        System.out.println("Los videojuegos tiene varios tipos");
    }
}
