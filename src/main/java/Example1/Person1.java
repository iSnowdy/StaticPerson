package Example1;

public class Person1 {
    private String name;
    private int age;
    private static int personCounter;

    public Person1() {}

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getPersonCounter() {
        return personCounter;
    }

    public static int increasePersonCounter() {
        return personCounter++;
    }
}
