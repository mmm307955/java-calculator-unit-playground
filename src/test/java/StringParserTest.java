import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringParserTest {
    @Test
    @DisplayName("기본 구분자(쉼표와 콜론)로 문자열을 나눈다")
    void parseWithDefaultSeparator() {
        String input = "1,2:3";
        String[] expected = {"1","2","3"};
        assertArrayEquals(expected,StringParser.parse("1,2:3"));
    }

    @Test
    @DisplayName("커스텀 구분자에 대한 테스트를 수행한다")
    void parseWithCustomSeparator(){
        String input = "//;\\n1;2;3";
        String[] expected = {"1","2","3"};
        assertArrayEquals(expected,StringParser.parse(input));
    }

    @Test
    @DisplayName("길이가 하나인 문자열은 그대로 반환한다")
    void stringlengthIsOne(){
        String input = "1";
        String[] expected = {"1"};
        assertArrayEquals(expected,StringParser.parse(input));
    }

    @Test
    @DisplayName("빈 문자열이면 빈 배열을 반환한다")
    void emptyStringResultEmptyArray(){
        String input = "";
        String[] expected = {};
        assertArrayEquals(expected,StringParser.parse(input));
    }
}
