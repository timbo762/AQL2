package ConditionCoverageTest;

import org.example.exo06.FizzBuzzpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Exo6Test {
    @Test
    public void testCondition_PositiveCheck() {
        assertThrows(IllegalArgumentException.class, () -> FizzBuzzpr.fizzBuzz(-1));
        assertEquals("1", FizzBuzzpr.fizzBuzz(1));
    }

    @Test
    public void testCondition_ModuloChecks() {
        assertEquals("FizzBuzz", FizzBuzzpr.fizzBuzz(30));
        assertEquals("Fizz", FizzBuzzpr.fizzBuzz(9));
        assertEquals("Buzz", FizzBuzzpr.fizzBuzz(20));
        assertEquals("7", FizzBuzzpr.fizzBuzz(7));
    }
}
