public class _11SumOfDigits {
    public static void main(String[] args) {
        String a="161";
        // int num=Integer.parseInt(a);
        //  int sum=0;
        //  while (num>0) { 
        //      int rem=0;
        //      rem=num%10;
        //      sum=sum+rem;
        //      num=num/10;
        //  }

        ///-----other logic
        int sum=0;
        for (int i = 0; i < a.length(); i++) {
            sum=sum+a.charAt(i)-'0';
        }
     
         System.out.println("sum of number "+sum);
    }
}
