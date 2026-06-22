class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        HashSet <Character> set=new HashSet<>();
         int maxLen=0;
         int windStart=0; 
        for(int wondEnd=0;wondEnd<n;wondEnd++){
            char c=s.charAt(wondEnd);
            while(set.contains(c)){
                set.remove(s.charAt(windStart));
                windStart++;
            }
            set.add(c);
            maxLen=Math.max(maxLen,wondEnd-windStart+1);
        }
         
      return maxLen;

    }
}