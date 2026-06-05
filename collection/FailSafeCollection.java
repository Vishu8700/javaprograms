package collection;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeCollection {
    public static void main(String[] args) {
        List<Integer> list=new CopyOnWriteArrayList<>();
        list.add(57);
        list.add(67);
        list.add(89);
        for (Integer integer: list)
        {
            System.out.println(list);
            list.add(87);
            list.add(60);
        }
    }
}
