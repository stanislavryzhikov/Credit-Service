package ru.itpark;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class creditServiceTest {
    @Test

    void calculateCredit(){
        {
            creditService testCredit = new creditService();
            double result = testCredit.calculateCredit(1000000, 12, 10);
            assertEquals(87916.0, result);
        }
        {
            creditService testCredit = new creditService();
            double result = testCredit.calculateCredit(0, 12, 10);
            assertEquals(0, result);
        }
        {
            creditService testCredit = new creditService();
            double result = testCredit.calculateCredit(1000000, 12, 0);
            assertEquals(0.0, result);
        }
    }
}