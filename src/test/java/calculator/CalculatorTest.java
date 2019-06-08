package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calc = new Calculator();

    @Before
    public void setUp() {
        Calculator calc = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(3, 2));
    }

    @Test
    public void testSubstract() {
        assertEquals(7, calc.substract(17, 10));
    }

    @Test
    public void testMultiply() {
        assertEquals(25, calc.multiply(5, 5));
        assertEquals(0, calc.multiply(0, 50));
    }

    @Test
    public void testPower() {
        assertEquals(49, calc.power(7));
    }

    @Test
    public void testDivision() {
        assertEquals(10, calc.divide(100, 10), 0.0001);
    }
}
