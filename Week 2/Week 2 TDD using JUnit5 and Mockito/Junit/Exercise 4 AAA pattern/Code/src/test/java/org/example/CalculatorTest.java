import org.example.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {
    private Calculator calculator;

    // Setup method
    @BeforeEach
    public void setUp() {
        // Arrange
        calculator = new Calculator();
        System.out.println("Setup completed.");
    }

    // Teardown method
    @AfterEach
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