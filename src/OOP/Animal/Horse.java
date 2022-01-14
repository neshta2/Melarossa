package OOP.Animal;

public class Horse extends Animal{
    @Override
    public String toString() {
        return "Horse{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public Horse() {
    }

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override //перегрузка метода
    public void MakeNoise() {
        System.out.println("Иго-го");
    }

    @Override //перегрузка метода
    public void eat() {
        System.out.println("Траву");
    }
}
