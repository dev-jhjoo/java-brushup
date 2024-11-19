import java.util.Random;

public class ControlStatements {
    public static void main(String[] args) {
        int score = 85;

        // if-else 조건문
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 80){
            System.out.println("Grade: B");
        } else {
            System.out.println("Grade: C");
        }

        // for 반복문
        for (int i = 0; i < 5; i++){
            System.out.println("For: " + i);
        }

        // while
        int count = 0;
        while (count < 3){
            System.out.println("Count: " + count);
            count++;
        }

        Random rand = new Random();
        int randomOenToFive = rand.nextInt(4) + 1;

        // Switch case
        switch (randomOenToFive){
            case 1:
                System.out.println("A");
                break;
            case 2:
                System.out.println("B");
                break;
            case 3:
                System.out.println("C");
                break;
            case 4:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }


    }
}
