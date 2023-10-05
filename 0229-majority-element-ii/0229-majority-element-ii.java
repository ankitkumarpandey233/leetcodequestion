class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        HashMap<Integer, Integer> count = new HashMap<>();
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(int c:nums){
            if(!count.containsKey(c)){
                count.put(c,1);
            }else{
                count.put(c,count.get(c)+1);
            }
        }
        for(int c:count.keySet()){
            if(count.get(c)>n/3){
                list.add(c);
            }
        }
    return list;
    }
}