package OOP.Person;

public class PersonTest {
    public static void main(String[] args) {
        Person Misha = new Person("Misha", 31);
        Person Dima = new Person("Dima", 31);
        Misha.setFullName("Misha");
        Misha.move();
        Dima.talk();
    }
}
