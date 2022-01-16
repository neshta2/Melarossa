package OOP.Person;

public class Person {
    public int age;
    public String fullName;


    public void move() {
        System.out.println(fullName + " говорит...");
    }

    public void talk() {
        System.out.println(fullName + " говорит ему " + age + " лет");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


}
