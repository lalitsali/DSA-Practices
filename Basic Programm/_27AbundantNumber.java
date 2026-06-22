public class _27AbundantNumber {
    public static void main(String[] args) {
     int num=19;
     int num1=num;
     int sum=0;
     for (int i = 1; i < num; i++) {
         if (num%i==0) {
            sum=sum+i;            
         }
     }
       if (num1<sum) {
           System.out.println("abudment number");
       } else {
        System.out.println("not abudment number");
       }


    }
}
