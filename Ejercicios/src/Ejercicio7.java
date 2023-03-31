public class Ejercicio7 {
    public static void vocales (String cadena) {
        int numVocales = 0;

        for (int indice = 0; indice < cadena.length(); indice++) {
            char caracter = cadena.toUpperCase().charAt(indice);

            if ((caracter == 'A') || (caracter == 'E') || (caracter == 'I')
                    || (caracter == 'O') || (caracter == 'U')) {
                numVocales++;
            }
        }

        System.out.println("Hay " + numVocales + " vocales.");
    }
}
