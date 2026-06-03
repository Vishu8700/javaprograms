package collectionprogram;

import java.util.ArrayList;

class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        // Adding elements
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Printing list
        System.out.println(list);

        // Removing element
        list.remove("Python");

        // Printing updated list
        System.out.println(list);

        // Accessing element by index
        System.out.println(list.get(0));
    }
}