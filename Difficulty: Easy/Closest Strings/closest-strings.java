class Solution {
    int shortestDistance(ArrayList<String> s, String word1, String word2) {
        // code here
    ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        if(word1.equals(word2)) return 0;
        int idx1=0,idx2=0;
        for(int i=0;i<s.size();i++) {
            if(s.get(i).equals(word1)) list1.add(i);
            else if(s.get(i).equals(word2)) list2.add(i);
        }
        int min=Integer.MAX_VALUE;
        for(int p=0;p<list1.size();p++) {
            for(int k=0;k<list2.size();k++) {
                int diff=list1.get(p)-list2.get(k);
                if(Math.abs(diff)<min) min=Math.abs(diff);   
            }
        }
        return min;        
    }
}