public class Palindromo {

    public boolean esPalindromo(String cadena) {
        String cadenaInvertida = "";

        char[] caracteres = cadena.toCharArray();

        for (int i = caracteres.length - 1; i >= 0; i--) {
            cadenaInvertida += caracteres[i];
        }

        return cadena.equals(cadenaInvertida);
    }

}
