public class Ejercicio8 {
    public static int devolver (int num) {
        int devuelta;

        if (num >= 21) {
            devuelta = num - 21;
        } else {
            devuelta = 2 * (21 - num);
        }

        return devuelta;
    }
}
