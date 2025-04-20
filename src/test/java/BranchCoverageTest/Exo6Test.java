package BranchCoverageTest;

import org.example.exo06.FizzBuzzpr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {

    @Test
    public void testFizzBuzz_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzpr.fizzBuzz(0));
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzpr.fizzBuzz(-1));// Cas où n est inférieur à 1
    }

    @Test
    public void testFizzBuzz_AllBranches() {
        assertEquals("FizzBuzz", FizzBuzzpr.fizzBuzz(15));  // Cas où n est divisible par 15
        assertEquals("Fizz", FizzBuzzpr.fizzBuzz(6));  // Cas où n est divisible par 3
        assertEquals("Buzz", FizzBuzzpr.fizzBuzz(10));  // Cas où n est divisible par 5
        assertEquals("7", FizzBuzzpr.fizzBuzz(7));  // Cas où n n'est divisible ni par 3, ni par 5
    }
}
