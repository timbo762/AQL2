package ConditionCoverageTest;

import org.example.exo04.QuadraticEquationpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Test {

    @Test
    public void testConditionDeltaLessThanZero() {
        double[] result = QuadraticEquationpr.solve(1, 0, 1); // b² - 4ac = -4
        assertEquals(0, result.length);
    }

    @Test
    public void testConditionDeltaEqualZero() {
        double[] result = QuadraticEquationpr.solve(1, 2, 1); // b² - 4ac = 0
        assertEquals(1, result.length);
    }

    @Test
    public void testConditionDeltaGreaterThanZero() {
        double[] result = QuadraticEquationpr.solve(1, -3, 2); // b² - 4ac = 1
        assertEquals(2, result.length);
    }

    @Test
    public void testConditionAEqualZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquationpr.solve(0, 1, 1);
        });
    }
}
