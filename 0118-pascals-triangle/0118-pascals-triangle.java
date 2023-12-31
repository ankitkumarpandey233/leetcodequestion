class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        
        if (numRows == 0) {
            return triangle;
        }
        
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);
        
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);
            
            for (int j = 1; j < prevRow.size(); j++) {
                newRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            
            newRow.add(1);
            triangle.add(newRow);
        }
        
        return triangle;
    
    }
}