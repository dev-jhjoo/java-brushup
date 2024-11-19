interface Purchase{
    void exec();
}

class Price{
    private String currency;
    private double amount;

    public Price(String currency, double amount){
        this.currency = currency;
        this.amount = amount;
    }


    public String getCurrency() {
        return currency;
    }

    public double getAmount() {
        return amount;
    }
}

class Product implements Purchase {
    private String name;
    private Price price;

    public Product(String name, Price price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }
    public Price getPrice() {
        return this.price;
    }

    @Override
    public void exec() {
        System.out.println(this.name + "\t" + this.price.getCurrency() + "\t" + this.price.getAmount());
    }
}

class Customer implements Purchase {
    private String name;
    private String email;
    private String address;
    private String phoneNumber;

    public Customer(String name, String email, String address, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void exec() {
        System.out.println(this.name + "\t" + this.email + "\t" + this.address + "\t" + this.phoneNumber);
    }
}

class Order {
    Product product;
    private int quantity;
    private double totalAmount;
    Customer customer;

    public Order(Product product, int quantity, Customer customer) {
        this.product = product;
        this.quantity = quantity;
        this.customer = customer;
        this.totalAmount = product.getPrice().getAmount() * quantity;
    }

    public void purchase() throws Exception {
        if (product == null) {
            throw new Exception("Product is null");
        }
        if (customer == null) {
            throw new Exception("Customer is null");
        }

        System.out.println("-------------------");
        System.out.println("Customer information");
        customer.exec();
        System.out.println("-------------------");
        System.out.println("Product information");
        product.exec();
        System.out.println("quantity:\t* " + this.quantity);
        System.out.println("-------------------");
        System.out.println("total amount: \t" + this.totalAmount );

    }
}


public class Transaction {
    public static void main(String[] args) throws Exception {
        Customer customer = new Customer(
                "William",
                "xxx@gmail.com",
                "road 77",
                "555-5555");
        Product product = new Product(
                "Macbook Pro",
                new Price(
                        "KRW",
                        2500000
                )
        );

        Order order = new Order(product, 2, customer);
        order.purchase();
    }
}
