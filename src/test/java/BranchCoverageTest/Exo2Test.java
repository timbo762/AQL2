package BranchCoverageTest;

import org.example.exo02.Anagrampr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo2Test {
    @Test
    void testAnagramTrueBranch() {
        assertTrue(Anagrampr.isAnagram("chien", "niche")); // branche true
    }

    @Test
    void testAnagramFalseBranchDifferentLength() {
        assertFalse(Anagrampr.isAnagram("abc", "abcd")); // s1.length != s2.length
    }





    @Test
    void testEdgeCaseEmptyStrings() {
        assertTrue(Anagrampr.isAnagram("", "")); // cas vide, branche true
    }
    @Test
    void testValidAnagramWithSpaces() {
        assertTrue(Anagrampr.isAnagram("Clint Eastwood", "Old West Action"));
    }
    @Test
    void testBranchNullFirst() {
        assertThrows(NullPointerException.class, () -> Anagrampr.isAnagram(null, "abc"));
    }

    @Test
    void testBranchNullSecond() {
        assertThrows(NullPointerException.class, () -> Anagrampr.isAnagram("abc", null));
    }
}
