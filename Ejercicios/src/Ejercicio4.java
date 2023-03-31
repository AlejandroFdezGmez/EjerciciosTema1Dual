public class Ejercicio4 {

    public static String imprimirNumeros (String cadena) {
        String cadenaNumeros = "";

        for (int indice = 0; indice < cadena.length(); indice++) {
            char caracter = cadena.toUpperCase().charAt(indice);
            int valorASCII = (int) caracter;

            if (valorASCII != 209 && (valorASCII < 65 || valorASCII > 90)) {
                cadenaNumeros += caracter;
            }
        }

        return cadenaNumeros;
    }
}
