package calculator;

public class Calculator {

    DelimiterFinder delimiterFinder = new DelimiterFinder();
    InputHandler inputHandler = new InputHandler();
    StringProcessor stringProcessor = new StringProcessor();
    OutputHandler outputHandler = new OutputHandler();

    public int addNumbers(String[] separatedValues) {
        int addedNumber = 0;

        for (String separatedValue : separatedValues) {
            addedNumber += emptyInputValue(separatedValue);
        }

        return addedNumber;
    }

    // 빈 배열에 0을 리턴하는 행동
    private int emptyInputValue(String separatedValue) {

        if (separatedValue.equals("")) {
            return 0;
        }
        return Integer.parseInt(separatedValue);
    }

    public void calculate() {

        String userInputValue = inputHandler.getUserInputValue();
        String customDelimiter = delimiterFinder.findCustomDelimiter(userInputValue);
        String userInputNumbers = stringProcessor.findUserInputNumbers(userInputValue);
        String standardDelimiter = delimiterFinder.makeStandardDelimiter(customDelimiter);
        String[] separatedNumbers = stringProcessor.separator(userInputNumbers, standardDelimiter);
        int result = addNumbers(separatedNumbers);

        outputHandler.printResult(result);
    }

}
