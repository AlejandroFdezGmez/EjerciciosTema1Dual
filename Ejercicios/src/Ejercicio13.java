public class Ejercicio13 {

    public static boolean mayor (int edad1, int edad2, int edad3) {
        boolean esAdolescente = false;

        if ((edad1 > 13 && edad1 < 19) || (edad2 > 13 && edad2 < 19) || (edad3 > 13 && edad3 < 19)) {
            esAdolescente = true;
        }

        return esAdolescente;
    }
}
