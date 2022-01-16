package OOP.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
   public static void main(String[] args) {

       List<Animal> animals = new ArrayList<Animal>();
       animals.add(new Dog("Мясо","Дом"));
       animals.add(new Cat("Рыба","Двор"));
       animals.add(new Horse());


       Cat cat = new Cat();
       cat.MakeNoise();
       System.out.println(animals.get(1));

   }
}
