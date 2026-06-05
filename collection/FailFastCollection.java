package collection;

import java.util.ArrayList;
import java.util.List;

public class FailFastCollection {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(45);
        list.add(93);
        list.add(78);

        for (Integer integer : list)
        {
            System.out.println(list);
            //list.add(45);
        }
    }
}
