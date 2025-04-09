package ConditionCoverageTest;



import org.example.exo01.Palindrome;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class Exo1Test {

    @Test
    void testEmptyString() {
        // i = 0, j = -1 → i < j est faux, boucle non exécutée
        assertTrue(Palindrome.isPalindrome(""));
    }

    @Test
    void testOneCharacter() {
        // i = 0, j = 0 → i < j est faux, boucle non exécutée
        assertTrue(Palindrome.isPalindrome("a"));
    }

    @Test
    void testEvenLengthPalindrome() {
        // boucle exécutée avec des conditions vraies
        assertTrue(Palindrome.isPalindrome("abba"));
    }

    @Test
    void testFailingCondition() {
        // boucle exécutée et une condition devient fausse
        assertFalse(Palindrome.isPalindrome("hello"));
    }

    @Test
    void testNull() {
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(null));
    }
}
