public class Main {
    public static void main(String[] args) {
        String[] juegoAv = new String[3];
        String[] juegoDe = new String[2];

        Aventura_corta juegoAv1 = new Aventura_corta("80 Days", "A.corta", 2014, "Inkle", 1920);
        Deporte juegoDe1 = new Deporte("8 ball pool", "pool", "pool", 96000);

        try {

            juegoAv[0] = "Juego 0";
            juegoAv[1] = "Juego 1";
            juegoAv[2] = "Juego 2";

            for (int i = 0; i < 3; i++) {
                System.out.println(juegoAv[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No se puede");
        } finally {
            juegoAv[0] = juegoAv1.getNombre();
            juegoAv[1] = juegoAv1.getTipo();
            for (int i = 0; i < juegoAv.length; i++) {
                System.out.println(juegoAv[i]);
            }
        }
    }
}
