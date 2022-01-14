package OOP.Animal;

import java.util.Objects;

//Создать класс Animal и расширяющие его классы Dog, Cat, Horse. Класс Animal содержит переменные food, location и методы makeNoise, eat, sleep.
// Метод makeNoise, например, может выводить на консоль "Такое-то животное издаёт звук". Dog, Cat, Horse переопределяют методы makeNoise, eat.
// Добавьте переменные в классы Dog, Cat, Horse, характеризующие только этих животных.
// Создайте класс Ветеринар, в котором определите метод void treatAnimal(Animal animal).
// Пусть этот метод распечатывает food и location пришедшего на прием животного.
// В методе main создайте массив типа Animal, в который запишите животных всех имеющихся у вас типов.
// В цикле отправляйте их на прием к ветеринару.
public class Animal {

    public String food;
    public String location;

    public Animal() {
        super();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(food, animal.food) && Objects.equals(location, animal.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(food, location);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void MakeNoise() {
        System.out.println("животное издаёт звук");
    }

    public void eat() {
        System.out.println("животное ест");
    }

    public void sleep() {

    }
}
