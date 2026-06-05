package collection;

import java.util.Map;

public class HashMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new java.util.HashMap<>();
        map.put("Employee ID",101);
        map.put("Address", 123);
        map.put("Age",30);
        map.put("Experice",8);
        map.put("Salary",20000);
        map.put("Phone Number",870036094);
        System.out.println(map);
//        System.out.println(map.size());
//        map.containsKey("Age");
//        System.out.println(map.containsKey("Age"));
//        map.containsValue(123);
//        System.out.println(map.containsValue(123));
//        map.hashCode();
//        System.out.println(map.hashCode());
//      //  map.remove("Age");
//        System.out.println(map.remove("Age"));
    // map itreator
     map.forEach((key,value)->
        {
            System.out.println(key +"     "+value);
        });
// value iterator
     for (Integer res : map.values())
     {
         System.out.println(res);
     }
     // key iterator
     for (String str:map.keySet())
     {
         System.out.println(str);
     }

     // another way to iterator map  using J2EE Method

        for(Map.Entry<String,Integer> entry :map.entrySet())
        {
            System.out.println(entry.getKey()+"----->"+entry.getValue());
        }

     }
}
