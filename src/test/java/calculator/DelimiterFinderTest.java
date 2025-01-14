package calculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DelimiterFinderTest {

    @DisplayName("정규식에 사용되는 기호를 입력할 때 예외처리 발생")
    @Test
    void throwRegexExceptionTest() {
        DelimiterFinder df = new DelimiterFinder();

        String number = "//+\\n1+2,3"; // 테스트할 때 \를 추가해야한다.

        Assertions.assertThatThrownBy(() -> df.findCustomDelimiter(number))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 정규표현식에 사용되는 기호는 입력할 수 없습니다.");
    }

}
