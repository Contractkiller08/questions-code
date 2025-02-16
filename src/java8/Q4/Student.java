package java8.Q4;

public class Student {
    private String name;
    private int age;
    private int roll_number;

    public Student(String name, int age, int roll_number) {
        this.name = name;
        this.age = age;
        this.roll_number = roll_number;
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

    public int getRoll_number() {
        return roll_number;
    }

    public void setRoll_number(int roll_number) {
        this.roll_number = roll_number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", roll_number=" + roll_number +
                '}';
    }
}
