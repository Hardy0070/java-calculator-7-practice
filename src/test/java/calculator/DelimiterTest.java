package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class DelimiterTest {

    @DisplayName("기본 구분자로 문자열 값을 구분한다.")
    @Test
    void separate() {
        Delimiter delimiter = new Delimiter();

        Assertions.assertThat(delimiter.separator("1,2:3")).isEqualTo(new String[]{"1","2","3"});
    }

}
