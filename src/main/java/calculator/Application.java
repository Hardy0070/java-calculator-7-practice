package calculator;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Delimiter delimiter = new Delimiter();

        String userInputValue = delimiter.getUserInputValue(); // 사용자 입력 값을 받는 행동

        String customDelimiter = delimiter.findCustomDelimiter(userInputValue); // 커스텀 구분자를 찾는 행동

        String userInputNumbers = delimiter.findUserInputNumbers(userInputValue); // 사용자 입력 값에서 커스텀 구분자를 제외한 나머지 값을 구분하는 행동

        String standardDelimiter = delimiter.makeStandardDelimiter(customDelimiter); // 기본 구분자와 커스텀 구분자를 정규식 패턴으로 만드는 행동 (수정 필요함)

        String[] separatedNumbers = delimiter.separator(userInputNumbers, standardDelimiter); // 정해진 패턴으로 숫자만 string타입으로 남기는 행동

        int result = delimiter.addNumbers(separatedNumbers); // string타입의 숫자를 int로 변환 후 다 더하는 행동

        System.out.println("결과 : " + result); // 결과를 출력하는 행동

    }
}
