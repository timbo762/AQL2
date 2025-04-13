package BranchCoverageTest;

import org.example.exo01.Palindromepr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {
    @Test
    public void testConditions() {
        assertThrows(NullPointerException.class, () -> Palindromepr.isPalindrome(null));
        assertTrue(Palindromepr.isPalindrome("RaceCar"));
        assertFalse(Palindromepr.isPalindrome("Testing"));
        assertTrue(Palindromepr.isPalindrome("No lemon no melon"));
    }
}
