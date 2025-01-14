package calculator;

public class StringProcessor {

    public String[] separator(String userInputNumbers, String standardDelimiter) {
        String[] numbers = userInputNumbers.split(standardDelimiter);

        for (String number : numbers) {
            validate(number);
        }

        return userInputNumbers.split(standardDelimiter);
    }

    public String findUserInputNumbers(String userInputValue) {

        if (userInputValue.contains("//")) {
            String endOfCustomDelimiter = "\\n";
            int endOfDelimiterIndex = userInputValue.indexOf(endOfCustomDelimiter);

            return userInputValue.substring(endOfDelimiterIndex + 2);
        }

        return userInputValue;
    }

    private void validate(String number) {
        validateNegativeNumber(validateEmpty(number));
    }

    private String validateEmpty(String number) {
        if (number == "") {
            number = "0";

            return number;
        }
        return number;
    }

    private void validateNegativeNumber(String number) {
        if (Integer.parseInt(number) < 0) {
            throw new IllegalArgumentException("[ERROR] 음수는 입력할 수 없습니다.");
        }
    }

}
