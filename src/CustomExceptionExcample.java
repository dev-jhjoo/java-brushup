class InvalidOrderAmountException extends Exception {
    public InvalidOrderAmountException(String message) {
        super(message);
    }
}

public class CustomExceptionExcample{
    public static void main(String[] args) {
        try{
            processOrder(-500);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void processOrder(int amount) throws InvalidOrderAmountException{
        if(amount <= 0){
            throw new InvalidOrderAmountException("Should be more than 0 amount");
        }
        System.out.println("Order complete:" + amount);
    }
}
