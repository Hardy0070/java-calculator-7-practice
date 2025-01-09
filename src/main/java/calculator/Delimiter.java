package calculator;

public class Delimiter {

    public String[] separator(String userInputValue) {
        return userInputValue.split(",|:");
    }

    public int addNumbers(String[] separatedValues) {
        int addedNumber = 0;

        for (String separatedValue : separatedValues) {
            addedNumber += Integer.parseInt(separatedValue);
        }

        return addedNumber;
    }
}
