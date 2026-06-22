public class _23PerfectNumber {
    public static void main(String[] args) {
     int num=496;
     int num1=num;
     int sum=0;
      
     for (int i = 1; i < num; i++) {
         if (num%i==0) {
             sum=sum+i;
         }
     }
     if (num1==sum) {
             System.out.println("perfect number");
     } else {
            System.out.println("not perfect number");
     }


    }
}
