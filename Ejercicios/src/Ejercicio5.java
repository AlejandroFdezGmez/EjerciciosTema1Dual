public class Ejercicio5 {
    /*
    public static void cadenaParidad (String cadena) {
        int numCarac = 0;

        for (int indice = 0; indice < cadena.length(); indice++) {
            char caracter = cadena.toUpperCase().charAt(indice);

            if (caracter != 32) {
                numCarac++;
            }
        }

        if (numCarac % 2 == 0) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }
    }

 */
    public static void cadenaParidad (String cadena) {
        int numCarac = 0;

        for (int indice = 0; indice < cadena.length(); indice++) {
            numCarac++;
        }

        if (numCarac % 2 == 0) {
            System.out.println("Es par.");
        } else {
            System.out.println("Es impar.");
        }
    }
}
