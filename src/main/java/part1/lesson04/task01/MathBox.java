package part1.lesson04.task01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MathBox {

    private final List<Number> numberList;

    public MathBox(Number[] numberList) {

        this.numberList = Arrays.asList(numberList);
    }

    public List<Number> getNumberList() {

        return this.numberList;
    }

    public int summator (List<Number>numbers){

        int summ = 0;

        for (Number number: numbers) {
            summ += (int) number;
        }

        return summ;
    }

    public void splitter(Integer divisor){

        List<Number>tempList = new ArrayList<>();

        Number temp;

        for (int i=0; i < this.numberList.size(); i++) {

            temp = (this.numberList.get(i).doubleValue())/divisor;

            this.numberList.set(i,temp);
        }

    }

}




