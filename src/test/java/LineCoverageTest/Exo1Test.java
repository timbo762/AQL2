package LineCoverageTest;



import org.example.exo01.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    @Test
    void testSimple() {
        assertTrue(Palindrome.isPalindrome("radar"));
    }

    @Test
    void testPhrase() {
        assertTrue(Palindrome.isPalindrome("Un roc cornu"));
    }

    @Test
    void testNonPalindrome() {
        assertFalse(Palindrome.isPalindrome("OUssama"));
    }

    @Test
    void testNull() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }
}
