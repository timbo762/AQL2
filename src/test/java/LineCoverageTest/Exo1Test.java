package LineCoverageTest;

import org.example.exo01.Palindromepr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {
    @Test
    public void testPalindrome_True() {
        assertTrue(Palindromepr.isPalindrome("radar"));
    }

    @Test
    public void testPalindrome_False() {
        assertFalse(Palindromepr.isPalindrome("hello"));
    }
    @Test
    public void testPalindrome_Null() {
        assertThrows(NullPointerException.class, () -> Palindromepr.isPalindrome(null));
    }
    @Test
    public void testPalindrome_TwoSameCharacters() {
        assertTrue(Palindromepr.isPalindrome("aa"));
    }
}
