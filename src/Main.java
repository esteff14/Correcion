public class Main {
    public static void main(String[] args) {
        String[] juegoAv = new String[3];
        String[] juegoDe = new String[2];

        Aventura_corta juegoAv1 = new Aventura_corta("80 Days", "A.corta", 2014, "Inkle", 1920);
        Deporte juegoDe1 = new Deporte("8 ball pool", "pool", "pool", 96000);

        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(juegoAv[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No se puede");
        } finally {
            juegoAv[0] = juegoAv1.getAutor();
            juegoAv[1] = juegoAv1.getNombre();
            juegoAv[2] = juegoAv1.getTipo();

            for (int i = 0; i < juegoAv.length; i++) {
                System.out.println(juegoAv[i]);
            }
            juegoAv1.imprimirVideojuego();
            juegoAv1.tipoAventura();
        }
        juegoDe1.setTipoDeporte("Pool");
        juegoDe[0] = juegoDe1.getNombre();
        juegoDe[1] = juegoDe1.getTipo();
        juegoDe[2] = String.valueOf(juegoDe1.getCosto());

        for(int i =0; i< juegoDe.length;i++){
            System.out.println(juegoDe[i]);
        }
        juegoDe1.imprimirVideojuego();
        juegoDe1.imprimirDep();
    }
}
