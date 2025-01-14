package calculator;

public class DelimiterFinder {

    public String makeStandardDelimiter(String customDelimiter) {
        String standardDelimiter = ",|:";

        if (customDelimiter != null) {
            standardDelimiter += "|" + customDelimiter;
        }

        return standardDelimiter;
    }

    public String findCustomDelimiter(String userInputValue) {
        if (userInputValue.contains("//")) {
            String substring = substringUserValue(userInputValue);
            validateRegexSign(substring);

            return substring;
        }

        return null;
    }

    private String substringUserValue(String userInputValue) {
        String endOfCustomDelimiter = "\\n";
        int endOfDelimiterIndex = userInputValue.indexOf(endOfCustomDelimiter);

        return userInputValue.substring(2, endOfDelimiterIndex);
    }

    private void validateRegexSign(String number) {
        String regexSigns = "\\.*+?^${}[]()|";

        if (regexSigns.contains(number)) {
            throw new IllegalArgumentException("[ERROR] 정규표현식에 사용되는 기호는 입력할 수 없습니다.");
        }
    }

}
