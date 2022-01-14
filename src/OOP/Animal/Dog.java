package OOP.Animal;

public class Dog extends Animal {
    @Override
    public String toString() {
        return "Dog{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public Dog() {
    }

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override //перегрузка метода
    public void MakeNoise() {
        System.out.println("ГАВ");
    }

    @Override //перегрузка метода
    public void eat() {
        System.out.println("Мясо");
    }
}
