package de.gabriel;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestCalculator {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void test_add_function() {
        double result = calculator.add(2,3);

        assertEquals(5, result);
    }

    @Test
    void test_sub_function() {
        double result = calculator.sub(10,3);

        assertEquals(7, result);
    }

//    @Test
//    void test_mult_function() {
//        double result = calculator.mult(2,3);
//
//        assertEquals(6, result);
//    }

//    @Test
//    void test_div_function() {
//        double result = calculator.div(6,2);
//
//        assertEquals(3, result);
//    }

}
