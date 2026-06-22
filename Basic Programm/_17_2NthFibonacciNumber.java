public class _17_2NthFibonacciNumber {
    public static void main(String[] args) {
    int a=0;
    int b=1;
    int nth=4;


    for(int i=1;i<nth;i++)
    {            
        int c=a+b;
         a=b;
         b=c;      
    }
    
    System.out.println("Nth number is: "+a);

    }
}
