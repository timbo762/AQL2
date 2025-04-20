package ConditionCoverageTest;
import org.example.exo03.BinarySearchpr;

import org.junit.Test;
import static org.junit.Assert.*;

public class Exo3Test {
    @Test
    public void testConditionTrueTrue() {
        int[] array = {1, 2};
        assertEquals(1, BinarySearchpr.binarySearch(array, 2));
    }

    @Test
    public void testConditionTrueFalse() {
        int[] array = {1, 2};
        assertEquals(0, BinarySearchpr.binarySearch(array, 1));
    }

    @Test
    public void testConditionFalse() {
        int[] array = {1, 2};
        assertEquals(-1, BinarySearchpr.binarySearch(array, 3));
    }
    @Test
    public void testSingleElementArrayConditionTrue() {
        int[] array = {5};
        assertEquals(0, BinarySearchpr.binarySearch(array, 5));  // Tableau à un élément avec condition vraie
    }

    @Test
    public void testSingleElementArrayConditionFalse() {
        int[] array = {5};
        assertEquals(-1, BinarySearchpr.binarySearch(array, 3));  // Tableau à un élément avec condition fausse
    }

    @Test
    public void testEdgeCaseNegativeElement() {
        int[] array = {-10, -5, 0, 5, 10};
        assertEquals(1, BinarySearchpr.binarySearch(array, -5));  // Recherche avec des éléments négatifs
    }
}
