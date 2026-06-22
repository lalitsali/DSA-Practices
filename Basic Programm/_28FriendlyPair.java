public class _28FriendlyPair {
    public static void main(String[] args) {
     
        int num1=6;
        int num2=289;
        if((sumofFacator(num1)/num1)==(sumofFacator(num2)/num2)){
            System.out.println("this is friendly pair");
        }else{
          System.out.println("this is not friendly pair");
        }

    }

    public static int sumofFacator(int num){
        int sum=0;

        for (int i = 1; i <= num; i++)
        {    if (num%i==0)
            {
               sum=sum+i;
            }
            
        }

    return sum;

    }
}
