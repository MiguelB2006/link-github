import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * String palabra = "oso";
         * boolean esPalindromo = false;
         * 
         * for (int i = 0; i < palabra.length(); i++) {
         * for (int j = palabra.length() - 1; j >= 0; j--) {
         * if (palabra.charAt(i) == palabra.charAt(j)) {
         * esPalindromo = true;
         * } else {
         * esPalindromo = false;
         * }
         * }
         * }
         * if (esPalindromo) {
         * System.out.println("La palabra es palindromo");
         * } else {
         * System.out.println("La palabra no es palindromo");
         * }
         * System.out.println("Hola");
         * 
         * int[] numeros = { 5, 12, 3, 20 };
         * for (int i : numeros) {
         * if (i > 10) {
         * System.out.println(i);
         * }
         * }
         */

        Estudiante estudiante1 = new Estudiante("Miguel Ángel Bustos Malagón");

        List<Float> notas = new ArrayList<>(Arrays.asList(3.0f, 4.2f, 2.4f));

        estudiante1.agregarNotas(notas);

        estudiante1.calcularPromedio();

    }
}
