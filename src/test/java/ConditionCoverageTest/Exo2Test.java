package ConditionCoverageTest;

import org.example.exo02.Anagrampr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 class Exo2Test {

    @Test
    void testBothNull() {
        assertThrows(NullPointerException.class, () -> Anagrampr.isAnagram(null, null));
    }

    @Test
    void testFirstNullSecondNotNull() {
        assertThrows(NullPointerException.class, () -> Anagrampr.isAnagram(null, "test"));
    }

    @Test
    void testFirstNotNullSecondNull() {
        assertThrows(NullPointerException.class, () -> Anagrampr.isAnagram("test", null));
    }

    @Test
    void testDifferentLengthsCondition() {
        assertFalse(Anagrampr.isAnagram("abc", "abcd"));  // condition sur les longueurs
    }

    @Test
    void testSameLengthNotAnagram() {
        assertFalse(Anagrampr.isAnagram("test", "abcd")); // même longueur, mais lettres différentes
    }

    @Test
    void testSameLengthAnagram() {
        assertTrue(Anagrampr.isAnagram("listen", "silent")); // cas positif avec lettres mélangées
    }
}
