package ConditionCoverageTest;

import org.example.exo05.RomanNumeralpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    public void testValidLowerBound() {
        assertEquals("I", RomanNumeralpr.toRoman(1));
    }

    @Test
    public void testValidUpperBound() {
        assertEquals("MMMCMXCIX", RomanNumeralpr.toRoman(3999));
    }

    @Test
    public void testInvalidLowerBound() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralpr.toRoman(0));
    }

    @Test
    public void testInvalidUpperBound() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralpr.toRoman(4000));
    }
}
