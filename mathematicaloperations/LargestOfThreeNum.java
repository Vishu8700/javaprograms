package mathematicaloperations;

public class LargestOfThreeNum {
    public static void main(String[] args) {
        int a=10,b=20,c=5;
        if (a>b && a>c)
        {
            System.out.println(a);
        }
        else if (b>c)
        {
            System.out.println(b);
        }
        else
        {
            System.out.println(c);
        }
    }
}
