
import java.util.Scanner;

public class _05SumOfNumbersInRange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int F= sc.nextInt();
        int E= sc.nextInt();
        int a=0;
         for(int i=F;i<=E;i++){
            a=a+i;
        }
      
        System.out.println(" from "+F+" to "+E+" sum is "+a);

    }
}
