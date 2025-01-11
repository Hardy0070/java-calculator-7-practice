package calculator;

public class StringProcessor {

    public String[] separator(String userInputNumbers, String standardDelimiter) {
        return userInputNumbers.split(standardDelimiter); // 파라미터로 받은 커스텀 구분자 정규식에 추가하기
    }

    public String findUserInputNumbers(String userInputValue) {

        if (userInputValue.contains("//")) {
            String endOfCustomDelimiter = "\\n";
            int endOfDelimiterIndex = userInputValue.indexOf(endOfCustomDelimiter);

            return userInputValue.substring(endOfDelimiterIndex + 2);
        }

        return userInputValue;
    }

}
