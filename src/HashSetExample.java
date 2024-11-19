import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numberSet = new HashSet<>();
        numberSet.add(1);
        numberSet.add(2);
        numberSet.add(2); // 중복값 무시

        for (int i : numberSet){
            System.out.println(i);
        }
    }
}
