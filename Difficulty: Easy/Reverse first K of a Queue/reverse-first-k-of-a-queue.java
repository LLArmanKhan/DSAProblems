class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
        if(k>q.size()) return q;
        Stack<Integer> st = new Stack<>();
        int n=q.size();
        for(int i=0;i<k;i++)
            st.push(q.remove());
        while(st.size()>0)
            q.add(st.pop());
        for(int i=0;i<n-k;i++)
            q.add(q.remove());
        return q;
    }
}