package BranchCoverageTest;

import org.example.exo06.FizzBuzzpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {
    @Test
    public void testFizzBuzz_ThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzpr.fizzBuzz(0));
    }

    @Test
    public void testFizzBuzz_AllBranches() {
        assertEquals("FizzBuzz", FizzBuzzpr.fizzBuzz(15));
        assertEquals("Fizz", FizzBuzzpr.fizzBuzz(6));
        assertEquals("Buzz", FizzBuzzpr.fizzBuzz(10));
        assertEquals("7", FizzBuzzpr.fizzBuzz(7));
    }
}
