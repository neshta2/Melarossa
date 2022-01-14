package OOP.Animal;

public class Vet extends Animal{

    public void treatAnimal(Animal animal){

    }

    public Vet() {
    }

    @Override
    public String toString() {
        return "Vet{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String getFood() {
        return super.getFood();
    }

    @Override
    public void setFood(String food) {
        super.setFood(food);
    }

    @Override
    public String getLocation() {
        return super.getLocation();
    }

    @Override
    public void setLocation(String location) {
        super.setLocation(location);
    }

    @Override
    public void MakeNoise() {
        super.MakeNoise();
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public Vet(String food, String location) {
        super(food, location);
    }


}
