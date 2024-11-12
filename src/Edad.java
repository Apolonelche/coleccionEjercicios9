public class Edad {
    public static String validarEdad(int edad) {
        if (edad >= 18 && edad <= 65) {
            return "Edad válida";
        }
        return "Edad no válida";
    }
}
