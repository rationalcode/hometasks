package part1.lesson02.task01;

/**
 * Задание 1. Написать программу ”Hello, World!”. В ходе выполнения программы она должна выбросить исключение и завершиться с ошибкой.
 *
 * Смоделировав ошибку «NullPointerException»
 * Смоделировав ошибку «ArrayIndexOutOfBoundsException»
 * Вызвав свой вариант ошибки через оператор throw
 *
 * @author Sayfullin Marat
 */
public class Main {

    public static void main(String[] args) {

        errorDemo1();

    }

    static String demo;

    /** Метод errorDemo1 моделирует ошибку «NullPointerException»*/
    static void errorDemo1 (){

        System.out.println(demo.charAt(12));
    }

    /** Метод errorDemo2 моделирует ошибку «ArrayIndexOutOfBoundsException»*/
    static void errorDemo2 (){

        char[] arr = new char []{'H','e','l','l','o','W','o','r','l','d','!'};

        for (int i=0; i<arr.length + 1; i++){

            System.out.print(arr[i] + " ");
        }


    }

    /** Метод errorDemo3 моделирует ошибку через оператор throw*/
    static void errorDemo3 (){

        throw new ArithmeticException();

    }


}
