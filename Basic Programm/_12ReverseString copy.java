public class _12ReverseString {
   public static void main(String []args){    
        String s="Congratulation Lalit Sali joining on 9 july mail on 21 june ";
        System.out.println("original string = "+s);

        System.out.println("simply revers string");
        System.out.println(case1(s));

        System.out.println("revers only sentence not word string");
        System.out.println(case2(s));
        
        System.out.println("revers only word not sentences string");
        System.out.println(case3(s));
    }

    public static String case1(String s) {
        
        String s1="";
        for(int i=s.length()-1;i>=0;i--)
        {
           s1=s1+s.charAt(i);
        }
        return s1;
    }

    public static String case2(String s) {
        
        String s1="";
        String sen[]=s.split(" ");
        for(int i=sen.length-1;i>=0;i-- ){
           s1=s1+sen[i]+" ";
        }

        return s1.trim();
    }

    public static String case3(String s) {     
        String s1=" ";
        String sen[]=s.split(" ");

        for(String word:sen){
            String rev=" ";
            for(int i=word.length()-1;i>=0;i--)
            {
                rev=rev+word.charAt(i);
            }
            s1=s1+rev;
        }

        return s1.trim();
    }




}
