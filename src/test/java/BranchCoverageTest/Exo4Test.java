package BranchCoverageTest;

import org.example.exo04.QuadraticEquationpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Test {

    @Test
    public void testDeltaNegativeBranch() {
        double[] result = QuadraticEquationpr.solve(2, 2, 2); // delta = -8
        assertEquals(0, result.length);
    }

    @Test
    public void testDeltaZeroBranch() {
        double[] result = QuadraticEquationpr.solve(1, 2, 1); // delta = 0
        assertEquals(1, result.length);
    }

    @Test
    public void testDeltaPositiveBranch() {
        double[] result = QuadraticEquationpr.solve(1, -5, 6); // delta = 1
        assertEquals(2, result.length);
    }

    @Test
    public void testAEqualZeroThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquationpr.solve(0, 2, 1);
        });
    }

}
