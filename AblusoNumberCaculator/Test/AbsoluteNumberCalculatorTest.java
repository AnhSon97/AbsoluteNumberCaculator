import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AbsoluteNumberCalculatorTest {

    @Test
    void testFindCalculator() {
        int number = 0;
        int expected =0;
        int result = AbsoluteNumberCalculator.findCalculator(number);
        assertEquals(expected,result);
    }
}