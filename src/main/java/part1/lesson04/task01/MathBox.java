package part1.lesson04.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MathBox {

    private List<Number> numberList;

    public MathBox(Number[] numberList) {
        this.numberList = Arrays.asList(numberList);
    }

    public List<Number> getNumberList() {
        return numberList;//new ArrayList <Number> (numberList);
    }

    public int summator (List<Number>numbers){

        int summ = 0;

        for (Number number: numbers) {
            summ += (int) number;
        }

        return summ;
    }

    public void splitter(){}

}
