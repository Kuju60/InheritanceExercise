package iteratorExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IteratorExercise {
    public static void main( String[] args ){
        //creating a list with some name
        List<String> names = new LinkedList<String>();
        names.add("Mike");
        names.add("Bob");
        names.add("Alice");

        //using the iterator interface with the names
        Iterator<String> iterator = names.iterator();

        //creating a while loop
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
