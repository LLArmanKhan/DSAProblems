class Solution {
    public class Pair{
        int val;
        int idx;
        Pair(int idx,int val){
            this.val=val;
            this.idx=idx;
        }
    }
    public ArrayList<Integer> calculateSpan(int[] arr) {
        // code here
        ArrayList<Integer> sol = new ArrayList<>();
        Stack<Pair> st = new Stack<>();
        
        int[] ans = new int[arr.length];
        ans[0]=1;
        
        // st.push(0,arr[0]) nhi bhai , st ka data type Pair tum int,int kaise pass kr rhe ho
        // st.push(Pair(0,arr[0])) , bhai Pair data type h , new Pair lagao
        st.push(new Pair(0,arr[0]));
        
        for(int i=1;i<arr.length;i++){
            while(st.size()>0 && st.peek().val<=arr[i]) st.pop();
            if(st.size()==0) ans[i]=i+1;
            else ans[i]=i-st.peek().idx;
            st.push(new Pair(i,arr[i]));
        }
        for(int i=0;i<ans.length;i++)
            sol.add(ans[i]);
        return sol;
    }
}