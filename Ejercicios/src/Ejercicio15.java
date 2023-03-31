public class Ejercicio15 {

    static int contador = 0;
    static int suma = 0;

    public static boolean esUnNumero(String cadena) {
        contador++;

        for(int i = 0; i < cadena.length(); i++) {
            char carac = cadena.toUpperCase().charAt(i);
            int valor = carac;

            if (valor == 209 || (valor > 65 && valor < 90)) {
                System.out.println("El parámetro No. " + contador + " no es numérico.");
                return false;
            }
        }
        suma += Integer.parseInt(cadena);
        return true;
    }
}