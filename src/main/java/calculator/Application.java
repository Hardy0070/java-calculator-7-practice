package calculator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Delimiter delimiter = new Delimiter();

        String userInputValue = delimiter.getUserInputValue();

        String customDelimiter = delimiter.findCustomDelimiter(userInputValue);

        String userInputValueExceptDelimiter = delimiter.findUserInputValue(userInputValue);

        String standardDelimiter = delimiter.makeStandardDelimiter(customDelimiter);

        String[] separatedNumbers = delimiter.separator(userInputValueExceptDelimiter, standardDelimiter);

        int result = delimiter.addNumbers(separatedNumbers);

        System.out.println("결과 : " + result);
    }
}
