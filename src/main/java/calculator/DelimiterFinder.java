package calculator;

public class DelimiterFinder {

    // 정규식 패턴을 만드는 애가 수정이 필요하다.
    public String makeStandardDelimiter(String customDelimiter) {
        String standardDelimiter = ",|:";

        if (customDelimiter != null) {
            standardDelimiter += "|" + customDelimiter;
        }

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
