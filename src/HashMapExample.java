import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("USA", "Washington");
        capitals.put("France", "Paris");
        capitals.put("Korea", "Seoul");

        for (String country : capitals.keySet()) {
            System.out.println(country + " 의 수도는 " + capitals.get(country));
        }

    }
}
