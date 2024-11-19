public class Person {

    // 필드
    private String name;
    private int age;

    // 생성자
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void introduce() {
        System.out.println("I am " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        // 객체 생성
        Person person = new Person("John Doe", 30);
        person.introduce();
    }


}
