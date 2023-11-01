import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-5, calculator.add(-2, -3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(0, calculator.subtract(0, 0));
        assertEquals(-1, calculator.subtract(-2, -1));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 0));
        assertEquals(-6, calculator.multiply(2, -3));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calculator.divide(6, 3));
        assertEquals(0, calculator.divide(0, 1));
        assertEquals(-2, calculator.divide(-6, 3));
        try {
            calculator.divide(6, 0);
            fail("Expected ArithmeticException");
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
