public class Ejercicio17 {

    public static void calcularLetra(String dni) {
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char letraIntroducida = dni.charAt(dni.length() - 1);
        int ndni = Integer.parseInt(dni.substring(0, dni.length() - 1));
        int resto = ndni % 23;

        if (letras.charAt(resto) == letraIntroducida) {
            System.out.println("La letra es correcta");
        } else {
            System.out.println("La letra de su dni no es " + letraIntroducida + " es " + letras.charAt(resto));
        }
    }
}
