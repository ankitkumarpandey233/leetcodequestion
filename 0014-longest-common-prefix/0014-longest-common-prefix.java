class Solution {
    public String longestCommonPrefix(String[] s) {
       if(s==null||s.length==0)
       {
           return "";
       } 

       String pre = s[0];
       for(int i=1;i<s.length;i++)
       {
           while(!s[i].startsWith(pre))
           {
               pre= pre.substring(0,pre.length()-1);
           }
       }
       return pre;
    }
}