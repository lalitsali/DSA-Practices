public class _13PalindromeNumber {
    public static void main(String[] args) {
        int num=15551;
          int sum=0;
          int num1=num;
        while(num>0){
          int rem=num%10;
          sum=sum*10+rem;
          num=num/10;        
        }
     if(num1==sum){
        System.out.println("palindrome");
     }else{
        System.out.println("not palindrome");

     }

    }
}
