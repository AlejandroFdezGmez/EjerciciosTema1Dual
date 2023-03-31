public class Ejercicio12 {

    public static boolean programa(String cadena) {
        boolean esVerdad = false;

        cadena = cadena.toLowerCase();

        if (cadena.startsWith("programa")) {
            esVerdad = true;
        }

        return esVerdad;
    }
}