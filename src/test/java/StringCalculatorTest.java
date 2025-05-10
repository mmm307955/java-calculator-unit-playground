import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringCalculatorTest {
    StringCalculator calculator = new StringCalculator();

    @Test
    @DisplayName("숫자 하나만 입력되었을 때 결과는 그 숫자이다")
    void numberOneResultIsNumber(){
        assertThat(calculator.calculateString("1")).isEqualTo(1);
    }

    @Test
    @DisplayName("여러 숫자들이 입력되었을 때 그 합을 반환한다")
    void numbersSumResultWhenInputNumbersString(){
        assertThat(calculator.calculateString("1", "2", "3", "4", "5")).isEqualTo(15);
    }

    @Test
    @DisplayName("음수를 전달할 때 Runtime Exception이 발생한다")
    void runtimeExceptionWhenNegativeNumber(){
        assertThatThrownBy(()->calculator.calculateString("1","-2","3")).isInstanceOf(RuntimeException.class);
    }

    @Test
    @DisplayName("빈 배열을 넣을 경우 0을 반환한다")
    void emptyArrayReturn0(){
        String[] emptyArr= {};
        assertThat(calculator.calculateString(emptyArr)).isEqualTo(0);
    }

    @Test
    @DisplayName("숫자가 아닌 문자를 포함하면 예외가 발생한다")
    void throwsExceptionWhenIncludeNotNumberAndChar(){
        assertThatThrownBy(()-> calculator.calculateString("1", "2", "a")).isInstanceOf(NumberFormatException.class);
    }
}
