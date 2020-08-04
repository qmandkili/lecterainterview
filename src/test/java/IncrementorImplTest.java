import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class IncrementorImplTest {

    private Incrementor incrementorTest;

    @BeforeEach
    void setUp() {
        incrementorTest = new IncrementorImpl();
    }

    @Test
    void testGetNumberInvokedFirstTime() {
        // Setup

        // Run the test

        // Verify the results
        Assert.assertTrue(incrementorTest.getNumber() == 0);
    }

    @Test
    void testSetMaxValueOneIncrementNumber() {
        // Setup

        // Run the test
        incrementorTest.setMaximumValue(1);
        incrementorTest.incrementNumber();

        // Verify the results
        Assert.assertTrue(incrementorTest.getNumber() == 0);
    }

    @Test
    void testIncrementNumberInvokedFirstTime() {
        // Setup

        // Run the test
        incrementorTest.incrementNumber();

        // Verify the results
        Assert.assertTrue(incrementorTest.getNumber() == 1);
    }

    @Test
    void testIncrementThenSetMaxZero() {
        // Setup

        // Run the test
        incrementorTest.incrementNumber();
        incrementorTest.setMaximumValue(0);

        // Verify the results
        Assert.assertTrue(incrementorTest.getNumber() == 0);
    }

    @Test
    void testIncrementThenSetMaxMinusOne() {
        // Setup

        // Run the test
        incrementorTest.incrementNumber();
        incrementorTest.setMaximumValue(-1);

        // Verify the results
        Assert.assertTrue(incrementorTest.getNumber() == 1);
    }

    @Test
    void testMaxZeroThenIncrement() {
        // Setup

        // Run the test
        incrementorTest.setMaximumValue(0);
        incrementorTest.incrementNumber();

        // Verify the results
        Assert.assertTrue(incrementorTest.getNumber() == 0);
    }

    @Test
    void testIncrementThenSetMaxOne() {
        // Setup

        // Run the test
        incrementorTest.incrementNumber();
        incrementorTest.setMaximumValue(1);

        // Verify the results
        Assert.assertTrue(incrementorTest.getNumber() == 0);
    }

    @Test
    void testSetMaxOneThenIncrement() {
        // Setup

        // Run the test
        incrementorTest.setMaximumValue(1);
        incrementorTest.incrementNumber();

        // Verify the results
        Assert.assertTrue(incrementorTest.getNumber() == 0);
    }

    @Test
    void testMaxTenThenIncrementTenTimes() {
        // Setup

        // Run the test
        incrementorTest.setMaximumValue(10);
        for (int i = 1; i <= 10; i++) {
            incrementorTest.incrementNumber();

            // Verify the results
            Assert.assertTrue(incrementorTest.getNumber() == i % 10);
        }
    }

    @Test
    void testSetMaxMoreThenIntThenIncrement() {
        // Setup

        // Run the test
        incrementorTest.setMaximumValue(Integer.MAX_VALUE + 1);
        incrementorTest.incrementNumber();

        // Verify the results
        Assert.assertTrue(incrementorTest.getNumber() == 1);
    }
}
