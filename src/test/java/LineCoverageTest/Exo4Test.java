package LineCoverageTest;

import org.example.exo04.QuadraticEquationpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo4Test {

    @Test
    public void testDeltaNegative() {
        double[] result = QuadraticEquationpr.solve(1, 0, 1); // delta = -4
        assertEquals(0, result.length);
    }

    @Test
    public void testDeltaZero() {
        double[] result = QuadraticEquationpr.solve(1, 2, 1); // delta = 0
        assertArrayEquals(new double[]{-1.0}, result);
    }
    @Test
    public void testAEqualZero() {
        assertThrows(IllegalArgumentException.class, () -> {
            QuadraticEquationpr.solve(0, 1, 1);  // a = 0, exception attendue
        });
    }

    @Test
    public void testDeltaPositive() {
        double[] result = QuadraticEquationpr.solve(1, -3, 2); // delta = 1
        assertArrayEquals(new double[]{2.0, 1.0}, result);
    }
}
