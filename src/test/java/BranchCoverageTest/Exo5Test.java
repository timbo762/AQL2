package BranchCoverageTest;

import org.example.exo05.RomanNumeralpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    public void testToRomanWithInvalidLow() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralpr.toRoman(0));
    }

    @Test
    public void testToRomanWithInvalidHigh() {
        assertThrows(IllegalArgumentException.class, () -> RomanNumeralpr.toRoman(4000));
    }

    @Test
    public void testToRomanWithCommonNumber() {
        assertEquals("XLII", RomanNumeralpr.toRoman(42));
    }

    @Test
    public void testToRomanWithSubtractiveNotation() {
        assertEquals("IX", RomanNumeralpr.toRoman(9));
    }
}
