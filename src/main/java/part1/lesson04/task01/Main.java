package part1.lesson04.task01;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        MathBox mathBox = new MathBox(generateNumber(10));
        System.out.println(mathBox.getNumberList());

        List<Number> testArray = mathBox.getNumberList();


        int summNumbers = mathBox.summator(testArray);
        System.out.println(summNumbers);

    }

    private static Number[] generateNumber (int count){

        Set <Number> numberSet = new HashSet<>();

        while(numberSet.size()<count){

            numberSet.add(new Random().nextInt(100));
        }

        return  numberSet.toArray(new Number[count]);
    }




}
