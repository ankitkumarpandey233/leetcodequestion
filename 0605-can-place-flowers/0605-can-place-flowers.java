class Solution {
    public boolean canPlaceFlowers(int[] f, int n) {
        int count=0;
        int s=f.length;
        for(int i=0;i<s;i++)
        {
        if(f[i]==0 && (i==0 || f[i-1]==0 ) && ( i==s-1 || f[i+1]==0))
        {
            f[i]=1;
            count++;
        }
        }
        if(count>=n)
        {
            return true;
        }
        return false;
    }
}