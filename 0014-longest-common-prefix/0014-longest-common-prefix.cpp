class Solution {
public:
    string longestCommonPrefix(vector<string>& str) 
    {
        string ans = "";
        int j=0;
        while(true)
        {
            if(str[0].length()<=j)
            {
                return ans;
            }
            
            char temp = str[0][j];
             
            for(int i=1; i<str.size(); i++)
            {
                if(str[i].length()>j)
                {
                    if(str[i][j]!=temp)
                    {
                        return ans;
                    }
                }
                else
                    return ans;
            }
            ans = ans + temp;
            j++;
        }

        return ans;    
    }
};