package LineCoverageTest;
import org.junit.Test;
import static org.junit.Assert.*;
import org.example.exo03.BinarySearchpr;

public class Exo3Test {
    @Test
    public void testElementFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(2, BinarySearchpr.binarySearch(array, 5));
    }

    @Test
    public void testElementNotFound() {
        int[] array = {1, 3, 5, 7, 9};
        assertEquals(-1, BinarySearchpr.binarySearch(array, 4));
    }

    @Test(expected = NullPointerException.class)
    public void testNullArray() {
        BinarySearchpr.binarySearch(null, 5);
    }
    @Test
    public void testEmptyArray() {
        int[] array = {};
        assertEquals(-1, BinarySearchpr.binarySearch(array, 5));  // Tableau vide
    }
    @Test
    public void testNegativeNumberArray() {
        int[] array = {-10, -5, 0, 5, 10};
        assertEquals(3, BinarySearchpr.binarySearch(array, 5));  // Cas avec des nombres négatifs
    }
}
