package Example3;

public class Person3 {
    private String name;
    private int age;
    private static int personCounter;

    public Person3() {}

    public Person3(String name, int age) {
        this.name = name;
        this.age = age;
        increasePersonCounter();
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
