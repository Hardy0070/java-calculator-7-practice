package calculator;

public class DelimiterFinder {

    public String makeStandardDelimiter(String customDelimiter) {
        String standardDelimiter = ",|:";

        standardDelimiter += "|" + customDelimiter;

        return standardDelimiter;
    }

    public String findCustomDelimiter(String userInputValue) {

        if (userInputValue.contains("//")) {
            String endOfCustomDelimiter = "\\n";
            int endOfDelimiterIndex = userInputValue.indexOf(endOfCustomDelimiter); // \ <-의 인덱스를 반환한다.

            return userInputValue.substring(2, endOfDelimiterIndex);
        }

        return null;
    }



}
