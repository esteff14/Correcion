public class Deporte extends Videojuegos{
    String tipoDeporte;
    int costo;

    public Deporte(String nombre, String tipo, String tipoDeporte, int costo) {
        super(nombre, tipo);
        this.tipoDeporte = tipoDeporte;
        this.costo = costo;
    }

    public void setTipoDeporte(String tipoDeporte) {
        this.tipoDeporte = tipoDeporte;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getTipoDeporte() {
        return tipoDeporte;
    }

    public int getCosto() {
        return costo;
    }

    public void imprimirDep(){
        System.out.println("Existen videojuegos dedicados al deporte");
    }

    @Override
    public void imprimirVideojuego() {
        System.out.println("Existen videojuegos que pueden ser jugables en consola o computadora");
    }
}
