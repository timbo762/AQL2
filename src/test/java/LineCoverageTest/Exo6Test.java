package LineCoverageTest;

import org.example.exo06.FizzBuzzpr;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {
    @Test
    public void testFizzBuzz_FizzBuzz() {
        assertEquals("FizzBuzz", FizzBuzzpr.fizzBuzz(15));
    }

    @Test
    public void testFizzBuzz_Fizz() {
        assertEquals("Fizz", FizzBuzzpr.fizzBuzz(3));
    }

    @Test
    public void testFizzBuzz_Buzz() {
        assertEquals("Buzz", FizzBuzzpr.fizzBuzz(5));
    }

    @Test
    public void testFizzBuzz_Number() {
        assertEquals("1", FizzBuzzpr.fizzBuzz(1));
    }
}
