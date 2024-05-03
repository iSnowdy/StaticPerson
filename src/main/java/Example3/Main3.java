package Example3;

public class Main3 {
    public static void main(String[] args) {
        Person3 p1 = new Person3("Tomas", 22);
        Person3 p2 = new Person3("Andre", 42);
        Person3 p3 = new Person3("Yena", 21);
        Person3 p4 = new Person3("Jaime", 15);

        System.out.println("People created: " + Person3.getPersonCounter());
    }
}