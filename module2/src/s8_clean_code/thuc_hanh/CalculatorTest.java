package s8_clean_code.thuc_hanh;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest extends Calculator {

    @Test
    @DisplayName("Testing addition")
    void testCalculateAdd() {
        int firstNummber = 1;
        int secondNumber = 1;
        int expected = 2;

        int result = Calculator.calculate(firstNummber, secondNumber, ADDITION);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing subtraction")
    void testCalculateSub() {
        int firstNummber = 2;
        int secondNumber = 1;
        int expected = 1;

        int result = Calculator.calculate(firstNummber, secondNumber, SUBTRACTION);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing multiplication")
    void testCalculateMul() {
        int firstNummber = 2;
        int secondNumber = 2;
        int expected = 4;

        int result = Calculator.calculate(firstNummber, secondNumber, MULTIPLICATION);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division")
    void testCalculateDiv() {
        int firstNummber = 6;
        int secondNumber = 3;
        int expected = 2;

        int result = Calculator.calculate(firstNummber, secondNumber, DIVISION);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Testing division by zero")
    void testCalculateDivByZero() {
        int firstNummber = 2;
        int secondNumber = 0;

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstNummber, secondNumber, DIVISION);});
    }

    @Test
    @DisplayName("Testing wrong operator")
    void testCalculateWrongOperator() {
        int firstNummber = 2;
        int secondNumber = 0;

        assertThrows(RuntimeException.class,
                ()-> {Calculator.calculate(firstNummber, secondNumber, EQUAL);});
    }
}