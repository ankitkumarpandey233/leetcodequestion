class Solution 
{
    public boolean checkIfPangram(String s) 
    {
        if(s.length() < 26)
        {
          return false;
        }
       
        for(int i=0;i<26;i++) 
        {
            if(s.indexOf((char)i+97)<0)
            {
              return false;
            } 
        }
        return true;
    }
}