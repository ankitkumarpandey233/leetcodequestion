class Solution 
{
  public int findPoisonedDuration(int[] timeSeries, int duration) 
    {
      int total = 0;      
        for (int i = 0; i < timeSeries.length - 1; i++) 
        {
          int timeDiff = timeSeries[i + 1] - timeSeries[i];
          total += Math.min(duration, timeDiff);
        }
        
        if (timeSeries.length > 0) 
        {
          total += duration;
        }
        
      return total;
    
    }
}