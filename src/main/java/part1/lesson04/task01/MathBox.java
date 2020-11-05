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
public class MathBox <TObject extends Number> extends ObjectBox <TObject> {

    public MathBox(Collection<TObject> list) {
        super(list);

    }

    public MathBox(TObject[] numberList) {

        super(new ArrayList<>(Arrays.asList(numberList.clone())));

    }

    @Override
    public List<TObject> getValues() {
        return (List<TObject>) collection;
    }

    /** метод summator() суммирует элементы коллекции */
    public Double summator (List<Number> numbers){

        double summ = 0.0;

        for (int i=0; i < numbers.size(); i++) {

            summ += numbers.get(i).doubleValue();
        }

        return summ;
    }

    /** метод splitter() делит значения элементов на значение аргумента */
    public void splitter (Integer divisor){

        Double temp;

        for (int i=0; i < collection.size(); i++) {

            temp =  (getValues().get(i).doubleValue()) / divisor;

            getValues().set(i,(TObject) temp);
        }

    }

    /** метод deleteMatchValue() удаляет значение элемента коллекции при совпадении с аргументом */
    public void deleteMatchValue (Integer value){

        int index;

        if(collection.contains(value)){

            index = getValues().indexOf(value);

            System.out.println("Совпадение объекта: индекс " + index + " значение " + getValues().get(index));

            getValues().remove(index);

            System.out.println("Удаление объекта");

        }

    }

    @Override
    public void addObject(TObject o) {

        if (o instanceof Number){

            collection.add((TObject) o);

        } else try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Элемент: " + o + " ("+ o.getClass() +") не соответствует коллекции MathBox !");
        }

    }

    @Override
    public void deleteObject(TObject o) {
        super.deleteObject(o);

        if(collection.contains(o)){
            collection.remove(o);
            System.out.println("Элемент " + o + " удален.");
        }
        System.out.println("Коллекция не содержит элемента: " + o);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox mathBox = (MathBox) o;
        return Objects.equals(collection, mathBox.collection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(collection);
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "numberList=" + collection +
                '}';
    }
}




