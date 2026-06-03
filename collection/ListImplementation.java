package collection;

import java.util.*;

public class ListImplementation {
    public static void main(String[] args) {

        Collection<String> list = new ArrayList<>();

        // add()
        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list);

        // remove()
        list.remove("Python");

        System.out.println(list);

        // contains()
        System.out.println(list.contains("Java"));

        // size()
        System.out.println(list.size());

        // isEmpty()
       // System.out.println(list.isEmpty());

        // clear()
        list.clear();

        System.out.println(list);
    }
}
