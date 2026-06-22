public class _26HarshadNumber {
    public static void main(String[] args) {
        int num=25;
        int num1=num;
        int sum=0;
       
        while (num>0) 
        { 
            int rem=num%10;
            sum=sum+rem;
            num/=10;
        }
        if (num1%sum==0) {
            System.out.println("harshad number");
        } else {
            System.out.println("not harshad number");

        }

    }
}
