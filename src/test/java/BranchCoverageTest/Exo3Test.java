package BranchCoverageTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.example.exo03.BinarySearchpr;

public class Exo3Test {
    @Test
    public void testLeftBranch() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(0, BinarySearchpr.binarySearch(array, 1));
    }

    @Test
    public void testRightBranch() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(4, BinarySearchpr.binarySearch(array, 9));
    }

    @Test
    public void testElementNotFoundBetween() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearchpr.binarySearch(array, 6));
    }
    @Test
    public void testEmptyArray() {
        int[] array = {};
        assertEquals(-1, BinarySearchpr.binarySearch(array, 1));  // Tableau vide
    }

    @Test
    public void testSingleElementArrayFound() {
        int[] array = {3};
        assertEquals(0, BinarySearchpr.binarySearch(array, 3));  // Un seul élément et trouvé
    }

    @Test
    public void testSingleElementArrayNotFound() {
        int[] array = {3};
        assertEquals(-1, BinarySearchpr.binarySearch(array, 1));  // Un seul élément mais non trouvé
    }

    @Test
    public void testNegativeNumbers() {
        int[] array = {-5, -3, -1, 1, 3};
        assertEquals(2, BinarySearchpr.binarySearch(array, -1));  // Recherche d'un nombre négatif
    }
}
