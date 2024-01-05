public class Aventura_corta extends Aventura{
    int duracionHoras;

    public Aventura_corta(String nombre, String tipo, int anio_lanzamiento, String autor, int duracionHoras) {
        super(nombre, tipo, anio_lanzamiento, autor);
        this.duracionHoras = duracionHoras;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }

    public void setDuracionHoras(int duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    public void aventurac(){
        System.out.println("Se caracterizan por tener duraciones de minutos y pocas horas");
    }

    @Override
    public void imprimirVideojuego() {
        System.out.println("Se caracterizan por ser juegos de puzzles");
    }
}
