public class Aventura_larga extends Aventura{
    String pais;

    public Aventura_larga(String nombre, String tipo, int anio_lanzamiento, String autor, String pais) {
        super(nombre, tipo, anio_lanzamiento, autor);
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    public void aventural(){
        System.out.println("Se caracterizan por duras horas");
    }

    @Override
    public void imprimirVideojuego() {
        System.out.println("El juego más largo dura 50 horas");
    }
}
