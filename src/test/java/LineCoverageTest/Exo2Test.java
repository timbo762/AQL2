package LineCoverageTest;

import org.example.exo02.Anagrampr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Exo2Test {

    @Test
    void testAnagramSimple() {
        assertTrue(Anagrampr.isAnagram("chien", "niche"), "Les mots 'chien' et 'niche' sont des anagrammes");
    }

    @Test
    void testAnagramWithSpacesAndCase() {
        assertTrue(Anagrampr.isAnagram("Un mot", "mot un"), "Les phrases 'Un mot' et 'mot un' sont des anagrammes en ignorant la casse et les espaces");
    }

    @Test
    void testNotAnagramDifferentLetters() {
        assertFalse(Anagrampr.isAnagram("chien", "chat"), "Les mots 'chien' et 'chat' ne sont pas des anagrammes");
    }

    @Test
    void testDifferentLengths() {
        assertFalse(Anagrampr.isAnagram("abcd", "abc"), "Des chaînes de longueurs différentes ne peuvent pas être des anagrammes");
    }

    @Test
    void testNullInputs() {
        assertThrows(NullPointerException.class, () -> Anagrampr.isAnagram(null, "test"), "Une des entrées est null");
        assertThrows(NullPointerException.class, () -> Anagrampr.isAnagram("test", null), "Une des entrées est null");
        assertThrows(NullPointerException.class, () -> Anagrampr.isAnagram(null, null), "Les deux entrées sont null");
    }

    @Test
    void testEmptyStrings() {
        assertTrue(Anagrampr.isAnagram("", ""), "Deux chaînes vides sont des anagrammes");
    }

    @Test
    void testSingleCharactersSame() {
        assertTrue(Anagrampr.isAnagram("a", "a"), "Une lettre identique est un anagramme");
    }

    @Test
    void testSingleCharactersDifferent() {
        assertFalse(Anagrampr.isAnagram("a", "b"), "Deux lettres différentes ne sont pas des anagrammes");
    }
}
