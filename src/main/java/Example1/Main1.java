package Example1;

public class Main1 {
    public static void main(String[] args) {
        Person1 p1 = new Person1("Tomas", 22);
        Person1.increasePersonCounter();
        Person1 p2 = new Person1("Andre", 42);
        Person1.increasePersonCounter();
        Person1 p3 = new Person1("Yena", 21);
        Person1.increasePersonCounter();

        System.out.println("People created: " + Person1.getPersonCounter());
    }
}