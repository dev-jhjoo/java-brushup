public class ThrowThrowsExample {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (IllegalArgumentException e) {
            System.out.println("예외 처리: " + e.getMessage());
        }
    }

    // throws : 메서드가 예외를 던질 가능성을 명시
    public static void validateAge(int age) throws IllegalArgumentException {
        if (age < 18) {
            // throw : 예외를 직접 발생시킬 때 사용
            throw new IllegalArgumentException("나이는 18 이상이어야 합니다.");
        }
    }
}
