class Solution 
{
    public int longestConsecutive(int[] s) 
    {

        Arrays.sort(s);
        int m=1;
        int n=1;
        if (s == null || s.length == 0) 
        {
            return 0;
        }
        for(int i=1;i<s.length;i++)
        {
            if(s[i]!=s[i-1])
            {
                if(s[i] == s[i - 1] + 1)
                {
                  n++;  
                }
                else
                {
                    n=1;
                }
                  m = Math.max(m,n);
            }
        }
        return m;
    }
}