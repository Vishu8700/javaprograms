package collection;

public class LinkedHashMap {
    public static void main(String[] args) {

        java.util.LinkedHashMap<Integer, String> map = new java.util.LinkedHashMap<>();

        // 1. put()
        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        // 2. get()
        System.out.println("Get Key 1: " + map.get(1));

        // 3. containsKey()
        System.out.println("Contains Key 2: " + map.containsKey(2));

        // 4. containsValue()
        System.out.println("Contains Value Java: " + map.containsValue("Java"));

        // 5. size()
        System.out.println("Size: " + map.size());

        // 6. isEmpty()
        System.out.println("Is Empty: " + map.isEmpty());

        // 7. remove()
        map.remove(3);
        System.out.println("After Remove: " + map);

        // 8. keySet()
        System.out.println("Keys: " + map.keySet());

        // 9. values()
        System.out.println("Values: " + map.values());

        // 10. clear()
        map.clear();
        System.out.println("After Clear: " + map);
    }
}