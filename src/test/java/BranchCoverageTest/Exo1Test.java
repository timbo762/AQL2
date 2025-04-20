package BranchCoverageTest;

import org.example.exo01.Palindromepr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {
    @Test
    public void testConditions() {
        assertThrows(NullPointerException.class, () -> Palindromepr.isPalindrome(null));
        assertTrue(Palindromepr.isPalindrome("Level"));
        assertFalse(Palindromepr.isPalindrome("Example"));
        assertTrue(Palindromepr.isPalindrome("A Santa at NASA"));
    }
    @Test
    public void testEmptyString() {
        // Chaîne vide, while non exécuté
        assertTrue(Palindromepr.isPalindrome(""));
    }
    @Test
    public void testPalindromeWithNumbers() {
        assertTrue(Palindromepr.isPalindrome("12321"));
    }

}
