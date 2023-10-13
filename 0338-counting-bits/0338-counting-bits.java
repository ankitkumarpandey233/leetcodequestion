class Solution {
    public int[] countBits(int n) {
        int result[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int no=i;
            int count=0;
            while(no!=0){
                if((no&1)==1){
                    count++;
                }
                no= no>>>1;
            }
                result[i]=count;
        }
        return result;
    }
}