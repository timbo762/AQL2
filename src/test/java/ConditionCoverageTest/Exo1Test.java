package ConditionCoverageTest;

import org.example.exo01.Palindromepr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {
    @Test
    public void testPalindrome_NullInput() {
        assertThrows(NullPointerException.class, () -> Palindromepr.isPalindrome(null));
    }

    @Test
    public void testPalindrome_AllBranches() {
        assertTrue(Palindromepr.isPalindrome("A man a plan a canal Panama"));
        assertFalse(Palindromepr.isPalindrome("Java"));
    }
}
