class Animal{
    public void makeSound(){
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal{
    @Override
    public void makeSound(){
        System.out.println("R! R!");
    }
}

public class PolymorphismExample {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();

        animal.makeSound();
        dog.makeSound();
    }
}
