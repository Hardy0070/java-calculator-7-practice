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

    public String findCustomDelimiter(String userInputValue) {

        if (userInputValue.contains("//")) {
            String endOfCustomDelimiter = "\n";
            int delimiterIndex = userInputValue.indexOf(endOfCustomDelimiter);

            return userInputValue.substring(2, delimiterIndex);
        }

        return null;
    }
}
