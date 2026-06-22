public class _17NthFibonacciNumber {
    public static void main(String[] args) {
    int a=0;
    int b=1;
    int nth=5;

    if (nth==1) {
            System.out.println(a);
            return;
        }else if(nth==2){
            System.out.println(b);
            return;
        }

    for(int i=3;i<=nth;i++)
    {            
        int c=a+b;
         a=b;
         b=c;      
    }
    
    System.out.println("Nth number is: "+b);

    }
}
