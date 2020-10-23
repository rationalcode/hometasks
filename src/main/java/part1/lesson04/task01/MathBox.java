package part1.lesson04.task01;


import java.util.*;

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
public class MathBox extends ObjectBox {

    private final List<Number> numberList;

    public MathBox(Number[] numberList) {

        this.numberList = new ArrayList<>(Arrays.asList(numberList));
    }


    /** метод getNumberList() возвращает коллекцию Number */
    public List<Number> getNumberList() {

        return numberList;
    }

    /** метод summator() суммирует элементы коллекции */
    public Double summator (List<? extends Number>numbers){

        double summ = 0.0;

        for (Number number: numbers) {

            summ += number.doubleValue();
        }

        return summ;
    }

    /** метод splitter() делит значения элементов на значение аргумента */
    public void splitter(Integer divisor){

        Number temp;

        for (int i=0; i < numberList.size(); i++) {

            temp = (numberList.get(i).doubleValue())/divisor;

            numberList.set(i,temp);
        }

    }

    /** метод deleteMatchValue() удаляет значение элемента коллекции при совпадении с аргументом */
    public void deleteMatchValue (Integer value){

        int index;

        if(numberList.contains(value)){

            index = numberList.indexOf(value);

            System.out.println("Совпадение объекта: индекс " + index + " значение " + numberList.get(index));

            numberList.remove(index);

            System.out.println("Удаление объекта");

        }

    }

    @Override
    public void addObject(Object o) {
        super.addObject(o);

        if (!(o instanceof Number)){
            try {
                throw new Exception();
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Элемент не соотвествует коллекции MathBox !");
            }
        } else this.numberList.add((Number) o);
    }

    @Override
    public void deleteObject(Object o) {
        super.deleteObject(o);

        if(this.numberList.contains(o)){
            this.numberList.remove(o);
            System.out.println("Элемент " + o + " удален.");
        }
        System.out.println("Коллекция не содержит элемента: " + o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(numberList, mathBox.numberList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberList);
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "numberList=" + numberList +
                '}';
    }
}




