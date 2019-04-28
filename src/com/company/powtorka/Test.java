package com.company.powtorka;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Animal dog2 = new Dog();
        Animal cat = new Cat();
        Animal mouse = new Mouse();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(dog2);
        animalList.add(cat);
        animalList.add(mouse);
        for (Animal animal:animalList){
            animal.run();
        }

        new Test().saveToDatabase(new Microsoft());
        new Test().saveToDatabase(new Oracle());
    }

    public void saveToDatabase(Database database){
        database.save();
    }
}
