import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator c = new Calculator();

    @Test
    @DisplayName("덧셈 테스트를 수행한다")
    void testAdd(){
        int result = c.add(2,3);
        assertEquals(5,result);
    }
    @Test
    @DisplayName("뺄셈 테스트를 수행한다")
    void testSubtract(){
        int result = c.subtract(2,3);
        assertEquals(-1,result);
    }

    @Test
    @DisplayName("곱셈 테스트를 수행한다")
    void testMultiply(){
        int result = c.multiply(2,3);
        assertEquals(6,result);
    }
    @Test
    @DisplayName("나눗셈 테스트를 수행한다")
    void testDivide(){
        int result = c.divide(6,3);
        assertEquals(2,result);
    }
}
