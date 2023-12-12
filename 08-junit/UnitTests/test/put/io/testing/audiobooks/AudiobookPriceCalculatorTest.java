package put.io.testing.audiobooks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AudiobookPriceCalculatorTest {
    private AudiobookPriceCalculator calculator;
    private Audiobook audiobook;

    @BeforeEach
    public void setUp() {
        calculator = new AudiobookPriceCalculator();
        audiobook = new Audiobook("Book",150);
    }

    @Test
    public void testStandard() {
        Customer Standard = new Customer("Test", Customer.LoyaltyLevel.STANDARD, false);
        assertEquals(audiobook.getStartingPrice(), calculator.calculate(Standard, audiobook));
    }

    @Test
    public void testSilver() {
        Customer Silver = new Customer("Test", Customer.LoyaltyLevel.SILVER, false);
        assertEquals(audiobook.getStartingPrice() * 0.9, calculator.calculate(Silver, audiobook));
    }

    @Test
    public void testGold() {
        Customer Gold = new Customer("Test", Customer.LoyaltyLevel.GOLD, false);
        assertEquals(audiobook.getStartingPrice() * 0.8, calculator.calculate(Gold, audiobook));
    }

    @Test
    public void testSubscriber() {
        Customer Subscriber  = new Customer("Test", Customer.LoyaltyLevel.STANDARD, true);
        assertEquals(0, calculator.calculate(Subscriber, audiobook));
    }

}