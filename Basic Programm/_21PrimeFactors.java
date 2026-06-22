public class _21PrimeFactors {
    public static void main(String[] args) {
int num=10;
        
        for (int  i= 2; i < 10; i++) {
            if (num%i==0) {
                if (prime(i)) {
                System.out.println(i+" ");
               }
            }
            
        }
        
    }
    public static  boolean prime(int num){
         if (num < 2) {
            return false;
        }
        for(int i=2; i<num;i++){
            if(num%i==0){
                return false;           
            }
        }
          return true;
    }
}
