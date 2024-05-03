package Example2;

public class Person2 {
    private String name;
    private int age;
    private static int personCounter;

    public Person2() {
        personCounter ++;
    }

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
        personCounter ++;
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
}
