package part1.lesson02.task03;

import java.util.Random;

public class Person {

    private int age;
    private String sex;
    private String name;

    public Person(int age, String sex, String name) {
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }
}
