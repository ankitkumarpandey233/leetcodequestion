class Solution 
{
    public String reverseWords(String s) 
    {
        StringBuilder r = new StringBuilder();
        int n = s.length();
        int last = n;
        for(int i=n-1;i>=0;i--)
        {
            if (s.charAt(i)==' ')
            {
                last =i;
            }
            else if(i==0||s.charAt(i-1)==' ')
            {
                if(r.length()>0)
                {
                    r.append(' ');
                }
                r.append(s,i,last);
            }

          
        }
        return r.toString();
    }
}