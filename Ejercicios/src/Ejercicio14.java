public class Ejercicio14 {

    public static  boolean palindromo (String cadena) {
        String cadenaR = "";
        boolean loEs = false;

        for (int indice = cadena.length() - 1; indice >= 0; indice++) {
            char caracter = cadena.toLowerCase().charAt(indice);
            cadenaR += caracter;
        }

        if (cadena == cadenaR) {
            loEs = true;
        }

        return loEs;
    }
}
