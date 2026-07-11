class Solution {
    public static class Pair{
        int idx;
        int val;
        Pair(int idx,int val){
            this.idx=idx;
            this.val=val;
        }
    }
    public static int getMaxArea(int arr[]) {
        // code here
        int n=arr.length;
        Stack<Pair> st = new Stack<>();
        int[] nextprev=new int[n];
        int[] preprev=new int[n];
        
        nextprev[n-1]=n;
        st.push(new Pair(n-1,arr[n-1]));
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && st.peek().val>=arr[i]) st.pop();
            if(st.size()==0) nextprev[i]=n;
            else nextprev[i]=st.peek().idx;
            st.push(new Pair(i,arr[i]));
        }
        
        while(st.size()>0) st.pop();
        
        preprev[0]=-1;
        st.push(new Pair(0,arr[0]));
        for(int i=1;i<n;i++){
            while(st.size()>0 && st.peek().val>=arr[i]) st.pop();
            if(st.size()==0) preprev[i]=-1;
            else preprev[i]=st.peek().idx;
            st.push(new Pair(i,arr[i]));
        }
        
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int a=arr[i]*(nextprev[i]-preprev[i]-1);
            if(a>max) max=a;
        }
        return max;
    }
}
