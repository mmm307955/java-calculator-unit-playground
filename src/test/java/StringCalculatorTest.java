import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class StringCalculatorTest {
    StringCalculator calculator = new StringCalculator();

    @Test
    @DisplayName("기본 구분자로 구성된 문자열을 더한다")
    void sumWithDefaultSeparator(){
        assertEquals(6,calculator.calculateString("1:2,3"));
    }

    @Test
    @DisplayName("커스텀 구분자가 포함된 문자열을 더한다")
    void sumWithCustomSeparator(){
        assertEquals(6,calculator.calculateString("//;\\n1;2;3"));
    }

    @Test
    @DisplayName("빈 문자열을 전달할 때 결과는 0이다")
    void emptyStringResultIs0(){
        assertEquals(0, "");
    }

    @Test
    @DisplayName("숫자 하나만 입력되었을 때 결과는 그 숫자이다")
    void numberOneResultIsNumber(){
        assertEquals(1,"1");
    }

    @Test
    @DisplayName("음수를 전달할 때 RuntimeException이 발생한다")
    void runtimeExceptionWhenNegativeNumber(){
        assertThrows(RuntimeException.class, ()-> calculator.calculateString("1,-2,3"));
    }

    @Test
    @DisplayName("숫자가 아닌 문자를 포함하면 RuntimeException이 발생한다")
    void runtimeExceptionWhenIncludingNotNumber(){
        assertThrows(RuntimeException.class, ()-> calculator.calculateString("1,a,b"));
    }
}
