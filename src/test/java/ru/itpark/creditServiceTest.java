package ru.itpark;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CreditServiceTest {
    @Test

    void calculateCredit(){
        {
            CreditService testCredit = new CreditService();
            double result = testCredit.calculateCredit(1_000_000, 12, 10);
            assertEquals(87916.0, result, 0.01);
        }
        {
            CreditService testCredit = new CreditService();
            double result = testCredit.calculateCredit(0, 12, 10);
            assertEquals(0, result, 0.01);
        }
        {
            CreditService testCredit = new CreditService();
            double result = testCredit.calculateCredit(1_000_000, 12, 0);
            assertEquals(0.0, result, 0.01);
        }
    }
}