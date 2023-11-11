class Solution {
    public int findChampion(int[][] grid) {
        int w = 0;
        for(int op = 0; op<grid[0].length; op++){
            if(op==w){
                continue;
            }
            if(grid[w][op]==0){
                w = op;
            }
        }
        return w;
    }
}