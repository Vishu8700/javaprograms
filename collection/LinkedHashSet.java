package collection;

import java.util.Iterator;
import java.util.Set;

public class LinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> lhs=new java.util.LinkedHashSet<>();
        lhs.add(78);
        lhs.add(45);
        lhs.add(3);
        lhs.add(79);
        lhs.add(35);
        lhs.add(30);
        lhs.add(100);

        System.out.println(lhs);
        Iterator<Integer> itr= lhs.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        lhs.add(56);
        lhs.add(55);
        System.out.println(lhs);
        lhs.size();
        System.out.println(lhs.size());
        //lhs.clear();
        //System.out.println(lhs);
        lhs.contains(79);
        System.out.println(lhs.contains(79));
    }
}
