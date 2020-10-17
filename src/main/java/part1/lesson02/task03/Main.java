package part1.lesson02.task03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

/**
 * Задание 3. Дан массив объектов Person.
 * Класс Person характеризуется полями age (возраст, целое число 0-100),
 * sex (пол – объект класса Sex со строковыми константами внутри MAN, WOMAN),
 * name (имя - строка). Создать два класса, методы которых будут реализовывать сортировку объектов.
 * Предусмотреть единый интерфейс для классов сортировки. Реализовать два различных метода сортировки этого массива по правилам:
 * первые идут мужчины
 * выше в списке тот, кто более старший
 * имена сортируются по алфавиту
 * Программа должна вывести на экран отсортированный список и время работы каждого алгоритма сортировки.
 * Предусмотреть генерацию исходного массива (10000 элементов и более).
 * Если имена людей и возраст совпадают, выбрасывать в программе пользовательское исключение.
 *
 * @author Sayfullin Marat
 */
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
