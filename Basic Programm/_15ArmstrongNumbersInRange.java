public class _15ArmstrongNumbersInRange {
    public static void main(String[] args) {
           int range=200;

           for (int i=0;i<=range;i++) {
               if (arm(i)) {
                   System.out.println(i+" ");
               }
           }

    }

    public static boolean  arm(int num) {
        int sum=0;
       int num1=num;
       while(num>0){
       int rem=num%10;
       sum=sum+rem*rem*rem;
       num/=10;
       }

      
       return sum==num1;


    }
}
