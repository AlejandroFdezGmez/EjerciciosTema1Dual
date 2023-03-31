public class Ejercicio16 {

    public static void rombo(int medio, int h) {
        //Espacios en blanco
        for(int espacio = 1; espacio<=medio-h; espacio++){
            System.out.print(" ");
        }
        //Asteriscos
        for(int ast=1; ast<=(h*2)-1; ast++){
            System.out.print("*");
        }
        System.out.println();
    }
}
