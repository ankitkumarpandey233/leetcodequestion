class Solution {
    public int[] countBits(int n) {
        int[]ans=new int[n+1];
        for(int i=0;i<=n;i++){
          int count=0;
          int no=i;
          while(no!=0){
            if((no&1)!=0){
                count++;
            }
            no=no>>1;
          }
          ans[i]=count;
        }
        return ans;
    }
}