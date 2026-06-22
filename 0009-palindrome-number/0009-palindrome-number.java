class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
          int sum=0;
          int num1=num;
        while(num>0){
          int rem=num%10;
          sum=sum*10+rem;
          num=num/10;        
        }
     if(num1==sum){
        return true;
     }else{
        return false;

     }
    }
}