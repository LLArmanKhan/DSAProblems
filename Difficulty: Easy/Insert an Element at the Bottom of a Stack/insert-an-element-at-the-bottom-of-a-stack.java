class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        Stack<Integer> st2 = new Stack<>();
        while(st.size()>0){
            st2.push(st.pop());
        }
        st.push(x);
        while(st2.size()>0){
            st.push(st2.pop());
        }
        return st;
    }
}