public class Ejercicio3 {

    static int count = 0;
    static int suma = 2;

    public static void suma() {
        count++;
        suma += 3;

        System.out.println("Número total de veces utilizadas la función: " + count);
        System.out.println("\nSuma total asciende a: " + suma);
    }
}