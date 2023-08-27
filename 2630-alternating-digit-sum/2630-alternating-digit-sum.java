class Solution 
{
    public int alternateDigitSum(int n) 
    {
      String numStr = String.valueOf(n);
        int sum = 0;
        
        for (int i = 0; i < numStr.length(); i++) 
        {
            int digit = Character.getNumericValue(numStr.charAt(i));
            
            if (i == 0) 
            {
                sum += digit; 
            } else 
            {
                if (i % 2 == 1) 
                {
                    sum -= digit;
                } else {
                    sum += digit; 
                }
            }
        }
        
        return sum;
    }
}