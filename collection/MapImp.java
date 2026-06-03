package collection;

    import java.util.HashMap;
import java.util.Map;

    public class MapImp{
        public static void main(String[] args) {

            Map<Integer, String> students = new HashMap<>();

            students.put(101, "Vishal");
            students.put(103, "Rahul");
            students.put(102, "Amit");
            students.put(104, "Aman");

            System.out.println(students);

            System.out.println("student:" + students.get(103));
            //students.remove(104);
            //System.out.println(students);
        }
    }