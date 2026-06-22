

public class _24PerfectSquare {
    public static void main(String[] args) {
       
        int num=5;
        if (pfs(num)) {
            System.out.println("perfect square");
        } else {
            System.out.println("not perfect square");

        }
    }
    public  static boolean pfs(int num){
     int num1=(int)Math.sqrt(num);

     if(num1*num1==num){
        return true;
     }

   return false;
    }
}
