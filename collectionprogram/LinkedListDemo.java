package collectionprogram;

import java.util.*;

class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        list.addFirst(5);
        list.addLast(40);

        System.out.println(list);
    }
}
