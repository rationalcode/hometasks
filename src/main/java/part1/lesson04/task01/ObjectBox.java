package part1.lesson04.task01;



import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/** Задание 2
 * Создать класс ObjectBox, который будет хранить коллекцию Object.
 * У класса должен быть метод addObject, добавляющий объект в коллекцию.
 * У класса должен быть метод deleteObject, проверяющий наличие объекта в коллекции и при наличии удаляющий его.
 * Должен быть метод dump, выводящий содержимое коллекции в строку.
 * */
public class ObjectBox {

    private List <Object> list = new ArrayList<>();

    public ObjectBox(Collection<Object> list) {

        this.list = (List<Object>) list;
    }

    public ObjectBox() {
    }

    public void addObject (Object o){

        list.add(o);
    }

    public void deleteObject (Object o){

        int index = 0;

        if(list.contains(o)){

            list.remove(o);
        }
    }

    public List <Object> dump (){

            return list;
    }


}
