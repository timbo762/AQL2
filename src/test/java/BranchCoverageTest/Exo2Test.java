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
    void testAnagramFalseBranchMismatchCount() {
        assertFalse(Anagrampr.isAnagram("test", "best")); // même longueur, lettres différentes
    }

    @Test
    void testEdgeCaseEmptyStrings() {
        assertTrue(Anagrampr.isAnagram("", "")); // cas vide, branche true
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
