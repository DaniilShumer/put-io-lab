package put.io.testing.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() throws Exception{
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        int a = calculator.add(4, 3);
        assertEquals(7, a);

        int b = calculator.add(-4, 6);
        assertEquals(2, b);
    }

    @Test
    public void testMultiply() {
        int c = calculator.multiply(4, 3);
        assertEquals(12, c);

        int d = calculator.multiply(-4, 2);
        assertEquals(-8, d);
    }

    @Test
    public void testAddPositiveNumbers() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
            int e = calculator.addPositiveNumbers(-2, 3);
            assertEquals(1, e);
        });
    }
}