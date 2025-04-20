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
    @Test
    public void testToRomanWithMaximumValue() {
        assertEquals("MMMCMXCIX", RomanNumeralpr.toRoman(3999));  // Cas avec la valeur maximale
    }
    @Test
    public void testToRomanWithNumberDivisibleBy1000() {
        assertEquals("M", RomanNumeralpr.toRoman(1000));  // Cas avec un multiple de 1000
    }
}
