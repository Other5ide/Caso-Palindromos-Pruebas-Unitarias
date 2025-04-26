public class Palindromo {
    public static void main(String[] args) {
    }

    public boolean esPalindromo(String cadena) {
        if (cadena == null || cadena.length() == 0) {
            throw new IllegalArgumentException("La cadena no puede ser nula");
        }
        String cleaned = cadena.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int left = 0, right = cleaned.length() - 1;

        while (left <= right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}
