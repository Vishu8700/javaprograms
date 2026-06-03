package collection;

import java.util.Iterator;
import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> ts=new java.util.TreeSet<>();
        ts.add(56);
        ts.add(7);
        ts.add(89);
        ts.add(90);
        ts.add(45);
        System.out.println(ts);
        Iterator<Integer> itr= ts.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
