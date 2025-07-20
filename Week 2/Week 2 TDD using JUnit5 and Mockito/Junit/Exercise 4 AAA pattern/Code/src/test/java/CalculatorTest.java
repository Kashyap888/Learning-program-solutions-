import org.example.Calculator;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private Calculator calculator;

    // Setup method
    @Before
    public void setUp() {
        // Arrange
        calculator = new Calculator();
        System.out.println("Setup completed.");
    }

    // Teardown method
    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown completed.");
    }

    // Test for addition
    @Test
    public void testAddition() {
        // Act
        int result = calculator.add(5, 3);

        // Assert
        assertEquals(8, result);
    }

    // Test for subtraction
    @Test
    public void testSubtraction() {
        // Act
        int result = calculator.subtract(10, 4);

        // Assert
        assertEquals(6, result);
    }
}

