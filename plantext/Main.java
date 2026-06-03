package plantext;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();
        HashSet<Integer> ids = new HashSet<>();

        while (true) {

            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Exit");

            System.out.print("Enter Number: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    if (ids.contains(id)) {
                        System.out.println("Duplicate ID not allowed!");
                        break;
                    }

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();

                    Student s = new Student(id, name, course);

                    students.add(s);
                    ids.add(id);

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:

                    if (students.isEmpty()) {
                        System.out.println("No Students Found!");
                    } else {

                        for (Student st : students) {
                            System.out.println(st);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student st : students) {

                        if (st.id == searchId) {
                            System.out.println(st);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 4:

                    System.out.print("Enter ID to Remove: ");
                    int removeId = sc.nextInt();

                    Iterator<Student> it = students.iterator();

                    boolean removed = false;

                    while (it.hasNext()) {

                        Student st = it.next();

                        if (st.id == removeId) {
                            it.remove();
                            ids.remove(removeId);

                            removed = true;

                            System.out.println("Student Removed!");
                        }
                    }

                    if (!removed) {
                        System.out.println("Student Not Found!");
                    }

                    break;

                case 5:

                    System.out.println("Program Ended");
                    System.exit(0);


                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}
