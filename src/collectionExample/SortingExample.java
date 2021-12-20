package collectionExample;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortingExample {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Zinna");
        names.add("Chimauche");
        names.add("Judith");
        names.add("Amara");

        //before sorting the name
        for (String name : names) {
            System.out.println(name);
        }
        //to sort
        Collections.sort(names);

        //after sorting
        for (String name : names) {
            System.out.println(name);
        }
    }
}
