public class _07GreatestOfThreeNumbers {
    public static void main(String[] args) {
     int a=2000;
     int b=2000;
     int c=2000;
      if (a==b &&a>c) {
           System.out.println(a+" and "+b+"is gratest");
      }
      else if (b==c && c>a) {
           System.out.println(b+" and "+c+"is gratest");
      }
      else if (a==c && c>b) {
           System.out.println(a+" and "+c+"is gratest");
      }
     else if(a>b && a>c){
        System.out.println(a+" is gratest");
     }else if(b>a && b>c){
        System.out.println(b+" is gratest");
     }else{
        System.out.println(c+" is gratest");
     }


    }
}
