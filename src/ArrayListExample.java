import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jane");
        names.add("Bob");

        // 데이터 출력
        for (String name : names) {
            System.out.println(name);
        }

        // 특정 인덱스 접근
        System.out.println(names.get(0));

        // 데이터 제거
        System.out.println(names);
        names.remove("Bob");
        System.out.println(names);

    }
}
