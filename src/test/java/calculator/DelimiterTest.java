package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DelimiterTest {

    Delimiter delimiter = new Delimiter();

    String standardDelimiter = delimiter.makeStandardDelimiter(delimiter.findCustomDelimiter("1,2:3"));

    String[] separatedValue = delimiter.separator("1,2:3", standardDelimiter);


    @DisplayName("기본 구분자로 문자열 값을 구분한다.")
    @Test
    void separate() {

        Assertions.assertThat(separatedValue).isEqualTo(new String[]{"1", "2", "3"});
    }

    @DisplayName("구분된 문자를 정수로 변환 후 모두 다 더한다.")
    @Test
    void addAllNumbers() {
        Assertions.assertThat(delimiter.addNumbers(separatedValue)).isEqualTo(6);
    }

    @DisplayName("틀린 값 테스트")
    @Test
    void addAllNumbersWrongAnswer() {
        Assertions.assertThat(delimiter.addNumbers(separatedValue)).isNotEqualTo("123");
    }

    @DisplayName("커스텀 구분자 찾기")
    @Test
    void findCustomDelimiter() {
        String customDelimiter = delimiter.findCustomDelimiter("//;\n1;2;3");

        Assertions.assertThat(customDelimiter).isEqualTo(";");
    }

    @DisplayName("2글자 이상인 커스텀 구분자 찾기")
    @Test
    void findCustomDelimiters() {
        String customDelimiter = delimiter.findCustomDelimiter("//;;;\n1;2;3");

        Assertions.assertThat(customDelimiter).isEqualTo(";;;");
    }

    @DisplayName("커스텀 구분자가 없을 때 null을 리턴한다.")
    @Test
    void findNull() {
        String noCustomDelimiter = delimiter.findCustomDelimiter("1,2:3");

        Assertions.assertThat(noCustomDelimiter).isNull();
    }

}
