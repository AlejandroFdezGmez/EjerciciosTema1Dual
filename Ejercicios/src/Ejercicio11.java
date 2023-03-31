public class Ejercicio11 {

    public static String cadenaPF (String cadena) {
        char ultimaLetra = cadena.charAt(cadena.length() - 1);

        return ultimaLetra + cadena + ultimaLetra;
    }
}
