public class _09PrimeNumber {
    public static void main(String[] args) {
     
        int num=21;
        boolean result=false;
         for (int i = 2; i < num; i++) {
            if(num==2){
                 result=false;
                 break;
            }
             if(num%i==0){
                result=true;
                break;
             }else{
                result=false;
             }
         }
         
         if(result){
            System.out.println("it is not prime number");
         }else{
            System.out.println("it is  prime number");
         }

    }
}
