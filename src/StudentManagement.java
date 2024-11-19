import java.util.*;

class Student {
    String name;
    int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public String toString() {
        return name + ": " + score;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        // 학생 데이터 저장
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 90));
        students.add(new Student("Charlie", 70));

        // 점수 기준으로 정렬
        students.sort(Comparator.comparingInt(s -> s.score));
        System.out.println("정렬된 학생 목록:");
        for (Student student : students) {
            System.out.println(student);
        }

        // 특정 점수 이상의 학생 출력 (Stream API 활용)
        int threshold = 80;
        System.out.println("\n점수가 " + threshold + " 이상인 학생:");
        students.stream()
                // 조건에 맞는 학생 필터링
                .filter(student -> student.score >= threshold)
                // 각 학생 출력
                .forEach(System.out::println);
    }
}
