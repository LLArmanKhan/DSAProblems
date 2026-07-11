class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        // code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        int n=arr.length;
        
        Stack<Integer> st = new Stack<>();
        st.push(arr[n-1]);
        
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && arr[i]>=st.peek())
                st.pop();
            if(st.size()==0) {
                ans.add(-1);
                st.push(arr[i]);
            }
            else ans.add(st.peek());
            st.push(arr[i]);
        }
        
        Collections.reverse(ans);
        return ans;
    }
}