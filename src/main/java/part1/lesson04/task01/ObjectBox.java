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
public class ObjectBox <TObject>{

    protected Collection<TObject> collection;

    public ObjectBox(Collection<TObject> collection) {

        this.collection = collection;
    }

    public ObjectBox() {

        this.collection = new ArrayList<>();
    }

    public Collection<TObject> getValues(){return collection;}


    public void addObject (TObject o){

        collection.add(o);
    }

    public void deleteObject (TObject o){

        int index = 0;

        if(collection.contains(o)){

            collection.remove(o);
        }
    }

    public Collection <TObject> dump (){

            return collection;
    }


}
