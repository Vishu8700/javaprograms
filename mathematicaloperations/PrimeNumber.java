package mathematicaloperations;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=2,count=0;
        for(int i=1;i<=n;i++){
            if(n%1==0)
                count++;
        }
        if(count==2)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }
}
