package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class IntegarImp {
    public static void main(String[] args) {
        List<Integer> lst3=new ArrayList<>();
        lst3.add(54);
        lst3.add(34);
        lst3.add(52);
        lst3.add(43);
        lst3.add(23);
        lst3.add(1);
        System.out.println(lst3);
        Collections.sort(lst3);
        System.out.println(lst3);
        lst3.remove(2);
        System.out.println(lst3);
        lst3.addFirst(34);
        System.out.println(lst3);
        lst3.addLast(59);
        System.out.println(lst3);
        Collections.sort(lst3);
        System.out.println(lst3);
        lst3.get(3);
        System.out.println(lst3.get(3));
        lst3.remove(2);
        System.out.println(lst3);
        lst3.contains(52);
        System.out.println(lst3.contains(52));
        //lst3.clear();
        //System.out.println(lst3);
        lst3.size();
        System.out.println(lst3.size());
       lst3.isEmpty();
        System.out.println(lst3.isEmpty());
        lst3.lastIndexOf(23);
        System.out.println(lst3.lastIndexOf(23));
        lst3.hashCode();
        System.out.println(lst3.hashCode());
    }
}
