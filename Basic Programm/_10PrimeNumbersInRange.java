public class _10PrimeNumbersInRange {
    public static void main(String[] args) {
       int range=30;

       for (int i=2;i<=range;i++) {
           if(prime(i)){
            
           }else{
            System.out.println(i+" ");
           }
       }

    }
    public static boolean prime(int num){
        boolean result=false;
        
        for(int i=2;i<num;i++){
            if(num==2){
            result=false;
            break;
          }
            if(num%i==0){
                result=true;
                break;
            }
        }

      return result;
    }
}
