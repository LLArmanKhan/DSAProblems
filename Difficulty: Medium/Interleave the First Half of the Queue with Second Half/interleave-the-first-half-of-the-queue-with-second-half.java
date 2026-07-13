class Solution {
    public void rearrangeQueue(Queue<Integer> q) {
        // code here
        int n=q.size();
        Stack<Integer> st = new Stack<>();
        while(q.size()>0) st.push(q.remove()); // 1 2 3 4
        while(st.size()>0) q.add(st.pop());    // 4 3 2 1
        while(q.size()>0) st.push(q.remove()); // 
        while(st.size()>n/2) q.add(st.pop()); // 1 2
        while(st.size()>0) {
            q.add(q.remove());
            q.add(st.pop()); 
        }
    }
}
