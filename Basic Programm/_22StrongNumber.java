public class _22StrongNumber {
    public static void main(String[] args) {
        int num=145;
        int num1=num;
        int sum=0;
        while (num>0) { 
            int rem=num%10;
            sum=sum+factor(rem);
            num/=10;

        }
        if (num1==sum) {
            System.out.println("strong number");
        }else{
            System.out.println("not strong  number");
        }

    }
    public static int factor(int num){
        int sum=1;
        for (int i = 1; i <=num; i++) {
            sum=sum*i;
        }
        return sum;


    }
}
