package LineCoverageTest;

import org.example.exo06.FizzBuzzpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {
    @Test
    public void testFizzBuzz_FizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzzpr.fizzBuzz(15));  // Ligne pour n % 15 == 0
    }

    @Test
    public void testFizzBuzz_Fizz() {
        assertEquals("Fizz", FizzBuzzpr.fizzBuzz(3));  // Ligne pour n % 3 == 0
    }

    @Test
    public void testFizzBuzz_Buzz() {
        assertEquals("Buzz", FizzBuzzpr.fizzBuzz(5));  // Ligne pour n % 5 == 0
    }

    @Test
    public void testFizzBuzz_Number() {
        assertEquals("1", FizzBuzzpr.fizzBuzz(1));  // Ligne pour un nombre normal, non divisible par 3 ni 5
    }
}
