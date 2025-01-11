package calculator;

import camp.nextstep.edu.missionutils.Console;

public class InputHandler {

    public String getUserInputValue() {
        System.out.println("덧셈할 문자을 입력해주세요.");
        return Console.readLine();
    }
}
