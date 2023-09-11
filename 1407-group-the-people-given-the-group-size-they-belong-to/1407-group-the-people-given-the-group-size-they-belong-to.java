public class Solution {
    public List<List<Integer>> groupThePeople(int[] gr) {
        HashMap<Integer, List<Integer>> m = new HashMap<>();
        List<List<Integer>> lst = new ArrayList<>();
        
        for(int i = 0; i < gr.length; i++) {
            int s = gr[i];
            m.putIfAbsent(s, new ArrayList<>());
            m.get(s).add(i);
            
            if(m.get(s).size() == s) {
                lst.add(new ArrayList<>(m.get(s)));
                m.get(s).clear();
            }
        }
        return lst;
    }
}