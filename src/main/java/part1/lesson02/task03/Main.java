package part1.lesson02.task03;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Person [] newPeoples = generatePersonsArray(10);

        for (Person person:   newPeoples) {

            System.out.println(person.getName() + " " + person.getAge() + " " + person.getSex());
        }

        long startTime = System.currentTimeMillis();

        Person [] sortArray = new PersonSorting().sort(newPeoples);

        long endTime = System.currentTimeMillis();

        System.out.println("Execute time :" + (endTime-startTime) + " ms");

        for (Person person:   sortArray) {

            System.out.println(person.getName() + " " + person.getAge() + " " + person.getSex());
        }

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

    static class PersonSorting implements Sorting {

        @Override
        public Person[] sort(Person[] people) {

            Person [] temp = new Person[people.length];

            for (int i=0, j=0; i<people.length;i++,j++) {



            }

            return temp;

        }


    }

    static class PersonException extends Exception{

    }

}
