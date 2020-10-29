package part1.lesson05.task01;

import java.util.Objects;

public class Animal {

    private static int counter = 0;
    private String animalName;
    private Person animalOwner;
    private int weight;
    private final int id;

    public Animal(String animalName, int weight, Person animalOwner) {
        this.animalName = animalName;
        this.animalOwner = animalOwner;
        this.weight = weight;
        id = counter;
        counter++;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public Person getAnimalOwner() {
        return animalOwner;
    }

    public void setAnimalOwner(Person animalOwner) {
        this.animalOwner = animalOwner;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return weight == animal.weight &&
                id == animal.id &&
                Objects.equals(animalName, animal.animalName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName, weight, id);
    }
}
