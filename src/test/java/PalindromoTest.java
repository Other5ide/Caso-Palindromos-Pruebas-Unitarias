import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromoTest {
    private Palindromo palindromo;

    @BeforeEach
    void setup() {
        palindromo = new Palindromo();
    }

    @Test
    void numeroEntero() {
        boolean res = palindromo.esPalindromo("200");
        assertTrue(res);
    }

    @Test
    void cadenaVacia() {
        assertThrows(IllegalArgumentException.class, () -> palindromo.esPalindromo(""));
    }

    @Test
    void cadena() {
        boolean res = palindromo.esPalindromo("aaabccbaaa");
        assertTrue(res);
    }

    @Test
    void cadena2() {
        boolean res = palindromo.esPalindromo("ahabccbaaa");
        assertFalse(res);
    }

    @Test
    void oracion() {
        boolean res = palindromo.esPalindromo("La tele letal");
        assertTrue(res);
    }

    @Test
    void singleCharacter() {
        boolean res = palindromo.esPalindromo("a");
        assertTrue(res);
    }

    @Test
    void mixedCase() {
        boolean res = palindromo.esPalindromo("RaceCar");
        assertTrue(res);
    }

    @Test
    void nullInput() {
        assertThrows(IllegalArgumentException.class, () -> palindromo.esPalindromo(null));
    }

    @Test
    void spaceString() {
        boolean res = palindromo.esPalindromo(" ");
        assertTrue(res);
    }

}