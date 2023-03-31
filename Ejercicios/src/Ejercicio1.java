public class Ejercicio1 {
    public static boolean soloLetras(String cadena) {

        for (int indice = 0; indice < cadena.length(); indice++) {
            char caracter = cadena.toUpperCase().charAt(indice);
            int valorASCII = (int) caracter;

            if (valorASCII != 209 && (valorASCII < 65 || valorASCII > 90)) {
                return false;
            }
        }

        return true;
    }
}
