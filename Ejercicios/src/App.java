public class App {
    public static void main(String[] args) throws Exception {
        String palabra = "oso";
        boolean esPalindromo = false;

        for (int i = 0; i < palabra.length(); i++) {
            for (int j = palabra.length() - 1; j >= 0; j--) {
                if (palabra.charAt(i) == palabra.charAt(j)) {
                    esPalindromo = true;
                } else {
                    esPalindromo = false;
                }
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es palindromo");
        } else {
            System.out.println("La palabra no es palindromo");
        }

    }
}
