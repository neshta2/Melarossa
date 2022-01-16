package OOP.Animal;

public class Cat extends Animal {

    public Cat(String food, String location) {
        super(food, location);
    }

    public Cat() {
    }

    @Override
    public String toString() {
        return "Cat{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override //перегрузка метода
    public void MakeNoise() {
        System.out.println("Мяу!");
    }

    @Override //перегрузка метода
    public void eat() {
        System.out.println("Корм");
    }
}
