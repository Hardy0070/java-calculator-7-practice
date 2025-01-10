package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Delimiter {

    public String getUserInputValue() {
        System.out.println("덧셈할 문자을 입력해주세요.");
        return Console.readLine();
    }

    public String makeStandardDelimiter(String customDelimiter) {
        String standardDelimiter = ",|:";

        standardDelimiter += "|" + customDelimiter;

        return standardDelimiter;
    }

    public String[] separator(String userInputValueExceptDelimiter, String standardDelimiter) {
        return userInputValueExceptDelimiter.split(standardDelimiter); // 파라미터로 받은 커스텀 구분자 정규식에 추가하기
    }

    public int addNumbers(String[] separatedValues) {
        int addedNumber = 0;

        for (String separatedValue : separatedValues) {
            addedNumber += Integer.parseInt(separatedValue);
        }

        return addedNumber;
    }

    public String findCustomDelimiter(String userInputValue) {

        if (userInputValue.contains("//")) {
            String endOfCustomDelimiter = "\\n";
            int endOfDelimiterIndex = userInputValue.indexOf(endOfCustomDelimiter); // \ <-의 인덱스를 반환한다.

            return userInputValue.substring(2, endOfDelimiterIndex);
        }

        return null;
    }

    public String findUserInputValue(String userInputValue) {

        if (userInputValue.contains("//")) {
            String endOfCustomDelimiter = "\\n";
            int endOfDelimiterIndex = userInputValue.indexOf(endOfCustomDelimiter);

            return userInputValue.substring(endOfDelimiterIndex + 2);
        }

        return userInputValue;
    }

}
