package collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetImp {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(23);
        set.add(11);
        set.add(67);
        set.add(87);
        set.add(87);
         set.add(90);
        set.add(3);

        System.out.println(set);

        Iterator<Integer> itr=set.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        System.out.println(set.contains(87));
        set.add(555);
        System.out.println(set);
        set.remove(23);
        System.out.println(set);
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        set.hashCode();
        System.out.println(set.hashCode());
    }
}
