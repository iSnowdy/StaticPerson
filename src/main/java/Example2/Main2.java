package Example2;

public class Main2 {
    public static void main(String[] args) {
        Person2 p1 = new Person2("Andre", 42);
        Person2 p2 = new Person2("Yena", 21);

        System.out.println("People created: " + Person2.getPersonCounter());
    }
}