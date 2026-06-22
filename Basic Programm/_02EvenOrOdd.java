import java.util.Scanner;

public class _02EvenOrOdd {
    public static void main(String[] args) {

      Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();

      if (a%2==0) {
          System.err.println(a+" it is even number");
      }else{
           System.err.println(a+" it is odd number");
      }

    }
}
