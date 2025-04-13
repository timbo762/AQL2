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
}
