package part1.lesson04.task01;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 *Задание 1. Написать класс MathBox, реализующий следующий функционал:
 *
 * Конструктор на вход получает массив Number. Элементы не могут повторяться. Элементы массива внутри объекта раскладываются в подходящую коллекцию (выбрать самостоятельно).
 * Существует метод summator, возвращающий сумму всех элементов коллекции.
 * Существует метод splitter, выполняющий поочередное деление всех хранящихся в объекте элементов на делитель, являющийся аргументом метода.
 * Хранящиеся в объекте данные полностью заменяются результатами деления.
 * Необходимо правильно переопределить методы toString, hashCode, equals,
 * чтобы можно было использовать MathBox для вывода данных на экран и хранение объектов этого класса в коллекциях (например, hashMap). Выполнение контракта обязательно!
 * Создать метод, который получает на вход Integer и если такое значение есть в коллекции, удаляет его.
 *
 * @author Sayfullin Marat
 */
public class Main {

    public static void main(String[] args) {

        MathBox mathBox = new MathBox(generateNumber(10));
        System.out.println(mathBox.getNumberList());

        List<Number> testArray = mathBox.getNumberList();


        int summNumbers = mathBox.summator(testArray);
        System.out.println(summNumbers);

        mathBox.splitter(5);
        System.out.println(mathBox.getNumberList());

    }

    private static Number[] generateNumber (int count){

        Set<Number> numberSet = new HashSet<>();

        while(numberSet.size()<count){

            numberSet.add(new Random().nextInt(100));
        }

        return  numberSet.toArray(new Number[count]);
    }


}
