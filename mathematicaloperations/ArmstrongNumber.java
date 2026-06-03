package mathematicaloperations;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n=370;
        int temp=n;
        int sum=0,rem;
        while(n>0)
        {
            rem=n%10;
            sum=sum+rem*rem*rem;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("Number is Armstrong");
        }
        else
        {
            System.out.println("Number is not Armstrong");
        }
    }
}
