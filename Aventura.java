public class Aventura extends Videojuegos{
    int anio_lanzamiento;
    String autor;

    public Aventura(String nombre, String tipo, int anio_lanzamiento, String autor) {
        super(nombre, tipo);
        this.anio_lanzamiento = anio_lanzamiento;
        this.autor = autor;
    }

    public void setAnio_lanzamiento(int anio_lanzamiento) {
        this.anio_lanzamiento = anio_lanzamiento;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio_lanzamiento() {
        return anio_lanzamiento;
    }

    public String getAutor() {
        return autor;
    }

    public void tipoAventura(){
        System.out.println("Caracterzados por la investigacion, exploracion");
    }

    @Override
    public void imprimirVideojuego() {
        System.out.println("Exiten miles de juegos de aventura");
    }
}
