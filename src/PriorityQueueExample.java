import java.util.PriorityQueue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(5);
        queue.add(20);

        while (!queue.isEmpty()) {
            // 가장 작은 값부터 제거
            System.out.println(queue.poll());
        }
    }
}
