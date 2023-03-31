public class Ejercicio9 {

    public static boolean dormir(boolean diaSemana, boolean vacaciones) {
        boolean poderDormir = false;

        if (diaSemana == false && vacaciones == true) {
            poderDormir = true;
        }

        return poderDormir;
    }
}