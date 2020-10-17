package part1.lesson02.task03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //создание компаратора
        Comparator <Person> personComparator = new PersonSexComparator()
                                                .thenComparing(new PersonAgeComparator())
                                                .thenComparing(Person::getName);
        //генерация массива объектов Person
        Person [] newPeoples = generatePersonsArray(10);

            for (Person person:   newPeoples) {

                System.out.println(person.getName() + " " + person.getAge() + " " + person.getSex());
            }
            System.out.println();

        //сортировка массива  по условиям в компараторе
        long startTime = System.currentTimeMillis();

            Arrays.sort(newPeoples,personComparator);

        long endTime = System.currentTimeMillis();

        long output = endTime - startTime;

            for (Person person:   newPeoples) {

                System.out.println(person.getName() + " " + person.getAge() + " " + person.getSex());
            }
            System.out.println("Execute time :" + startTime +" "  + endTime + " " + output + " ms");

    }

    public static Person[] generatePersonsArray (int count){

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        Random random = new Random();

        Person [] people = new Person[count];

        for(int i=0; i<people.length; i++){

            people[i] = new Person (random.nextInt(100)
                                 , (random.nextBoolean() ? "MEN" : "WOMAN")
                                 ,  alphabet.charAt(random.nextInt(25)) +"Name");

        }
        return people;
    }




    static class PersonException extends Exception{

    }

}
