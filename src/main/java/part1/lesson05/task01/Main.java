package part1.lesson05.task01;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List <Animal> animalList = new ArrayList<>();
        animalList.add(new Animal("Kelly", 5,new Person("Bob",20,"MEN")));
        animalList.add(new Animal("George", 3,new Person("Bob",21,"MEN")));
        animalList.add(new Animal("Ruby", 3,new Person("Kate",24,"WOMEN")));

        for (Animal animal: animalList) {

            System.out.println(animal.getAnimalOwner().getName() + " " + animal.getAnimalName() + " " + animal.getWeight() + " " + animal.getId());

        }

        findAnimalName("Ruby", animalList);
        modifyAnimalInfo(2, "RubyNew", 10, animalList);

        System.out.println(animalList.get(2).getAnimalName());


    }

    public static void findAnimalName(String name, List <Animal> animalList){

        boolean find = false;

        for (Animal animal: animalList) {

            if (animal.getAnimalName().equals(name)) {

                find = true;
                break;
            }

        }
        System.out.println( find ? "Объект: " + name + " найден" : "Объект: " + name + " не найден");
    }

    public static void modifyAnimalInfo(int id, String animalName, int animalWeight, List <Animal> animalList){

        boolean find = false;

        for (Animal animal: animalList) {

            if (animal.getId() == id) {

                animal.setAnimalName(animalName);
                animal.setWeight(animalWeight);

                find = true;
                break;
            }

        }
        System.out.println( find ? "Объект с id: " + id + " изменен" : "Объект с id: " + id + " не найден");
    }
}
