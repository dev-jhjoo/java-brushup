import java.util.Scanner;

public class InputValidationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        while (true) {
            System.out.print("숫자를 입력하세요: ");
            try {
                number = Integer.parseInt(scanner.nextLine()); // 숫자 변환 시도
                break; // 성공하면 반복문 종료
            } catch (NumberFormatException e) {
                System.out.println("유효하지 않은 입력입니다. 숫자를 입력해주세요.");
            }
        }

        System.out.println("입력된 숫자: " + number);
        scanner.close();
    }
}
