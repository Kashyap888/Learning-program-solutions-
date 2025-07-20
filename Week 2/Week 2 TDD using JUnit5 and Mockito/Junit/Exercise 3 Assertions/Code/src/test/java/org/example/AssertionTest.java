import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionTest{

    @Test
    public void testAssertions() {
        System.out.println("Running testAssertions...");
        // Assert equals
        assertEquals(5, 2 + 3,"Sum should be 5");

        // Assert true
        assertTrue(5 > 3,"5 should be greater than 3");

        // Assert false
        assertFalse(5 < 3,"5 should not be less than 3");

        // Assert null
        assertNull(null);

        // Assert not null
        assertNotNull(new Object());
        System.out.println("Assertions completed successfully.");
    }
}
