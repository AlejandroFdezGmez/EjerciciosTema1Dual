public class Ejercicio6 {
    public static void tipoTriangulo (float lado1, float lado2, float lado3) {

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("El triángulo es equilátero.");
        } else if ((lado1 == lado2 && lado1 != lado3) || (lado1 == lado3 && lado1 != lado2) ||
                (lado2 == lado3 && lado2 != lado1)) {
            System.out.println("El triángulo es isósceles.");
        } else {
            System.out.println("El triángulo es escaleno.");
        }
    }
}
