package part1.lesson04.task01;

import java.util.*;


/**
 Задание 3. Доработать классы MathBox и ObjectBox таким образом, чтобы MathBox был наследником ObjectBox.
 Необходимо сделать такую связь, правильно распределить поля и методы.
 Функциональность в целом должна сохраниться. При попытке положить Object в MathBox должно создаваться исключение.
 */
public class Main {

    public static void main(String[] args) {

            //создание объекта MathBox, addObject, deleteObject - проверка методов родительского класса ObjectBox
            MathBox mathBox = new MathBox(generateNumber(10));

            mathBox.addObject(new Random().nextInt(10) * 0.1);
            mathBox.addObject(6);
            mathBox.addObject(5);
            mathBox.addObject(2.3);

            System.out.println(mathBox.getValues());

            mathBox.deleteObject(66);
            System.out.println(mathBox.getValues());
            System.out.println();

            //проверка методов объекта MathBox: summator, splitter, getNumberList, deleteMatchValue
            List <Number>testArray = mathBox.getValues();

            Double summNumbers = mathBox.summator(testArray);
            System.out.println("Сумма элементов коллекции: " + summNumbers);

            mathBox.deleteMatchValue(5);
            System.out.println(mathBox.getValues());
            System.out.println();

            mathBox.splitter(5);
            System.out.println(mathBox.getValues());
            System.out.println();

            //Размещение объектов типа MathBox в коллекции HashMap

            Map<Integer, MathBox> mathBoxMap = new HashMap<>();
            mathBoxMap.put(1, new MathBox(generateNumber(10)));
            mathBoxMap.put(2, new MathBox(generateNumber(10)));
            mathBoxMap.put(3, new MathBox(generateNumber(10)));

            mathBoxMap.get(1).addObject(10.5);
            mathBoxMap.get(1).getValues().add(500);

            for (MathBox box : mathBoxMap.values()) {
                System.out.println(box.getValues());
            }

        }
        /** метод generateNumber() генерирует коллекцию которая содержит случайные неповторяющиеся числа */
        private static Number[] generateNumber (int count){

            Set<Number> numberSet = new HashSet<>(10);

            while (numberSet.size() < count) {

                numberSet.add(new Random().nextInt(99) + 1);

            }

            return numberSet.toArray(new Number[count]);

        }

}
