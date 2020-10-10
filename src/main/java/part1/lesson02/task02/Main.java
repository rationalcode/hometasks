package part1.lesson02.task02;

/** Задание 2. Составить программу, генерирующую N случайных чисел. Для каждого числа k вычислить квадратный корень q.
 *  Если квадрат целой части q числа равен k, то вывести это число на экран.
 *  Предусмотреть что первоначальные числа могут быть отрицательные, в этом случае генерировать исключение.
 *
 *  @author Sayfullin Marat
 *  */

public class Main {

    public static void main(String[] args) {

        int [] arrWork = generateArray(10);

        System.out.println();

        computeSqrt(arrWork);


    }

    /** generateArray - метод генерирует массив целых чисел */
    private static int[] generateArray (int count){

        int [] intArray = new int[count];

        for (int i=0; i<intArray.length; i++){

            intArray[i] = (int)(Math.random()*(200 + 1))-100; // диапазон генерируемых чисел [-100; 100]

            System.out.print(intArray[i] + " ");
        }
        return  intArray;
    }

    /** computeSqrt - метод вычисляет квадратный корень элемента массива затем производит обратную процедуру возведения в квадрат,
     * в случае отрицательного числа выбрасывается исключение */
    private static void  computeSqrt (int [] arr){

        double q;

        for (int i = 0, j = 1; i<arr.length; i++, j++){

            if (arr[i] < 0){

                throw new ArithmeticException();

            }

                q = Math.sqrt(arr[i]);

                q = Math.pow(q,2);

                System.out.println(j + ". " + q + " ");

            if (Math.round(q) == arr[i]){ //если есть совпадение

                System.out.println("coincidence: " + q + " = " + arr[i]);

            }


        }

    }


}
