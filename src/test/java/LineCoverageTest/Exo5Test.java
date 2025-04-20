package LineCoverageTest;

import org.example.exo05.RomanNumeralpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo5Test {

    @Test
    public void testToRoman1() {
        assertEquals("I", RomanNumeralpr.toRoman(1));
    }

    @Test
    public void testToRoman58() {
        assertEquals("LVIII", RomanNumeralpr.toRoman(58));
    }

    @Test
    public void testToRoman1994() {
        assertEquals("MCMXCIV", RomanNumeralpr.toRoman(1994));
    }
    @Test
    public void testToRomanMax() {
        assertEquals("MMMCMXCIX", RomanNumeralpr.toRoman(3999));  // Cas avec le nombre maximum
    }
}

