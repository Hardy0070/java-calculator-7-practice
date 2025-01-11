package calculator;

public class Calculator {

    DelimiterFinder delimiterFinder = new DelimiterFinder();
    InputHandler inputHandler = new InputHandler();
    StringProcessor stringProcessor = new StringProcessor();
    OutputHandler outputHandler = new OutputHandler();

    public int addNumbers(String[] separatedValues) {
        int addedNumber = 0;

        for (String separatedValue : separatedValues) {
            addedNumber += Integer.parseInt(separatedValue);
        }

        return addedNumber;
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
