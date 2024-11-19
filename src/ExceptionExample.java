public class ExceptionExample {
    public static void main(String[] args) {
        try{
            int result = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println("MyException:" + e.getMessage());
        }
    }
}
