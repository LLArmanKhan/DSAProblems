class Solution {
    public int celebrity(int mat[][]) {
        // code here
        Stack<Integer> st = new Stack<>();
        int n=mat.length;
        
        for(int i=0;i<n;i++) st.push(i);
            
        while(st.size()>1){
            
            Boolean aflag=true,bflag=true;
            int a=st.pop();
            int b=st.pop();
            
            if(mat[a][b]==1) // mtlb a jaanta h b ko
                aflag=false;
            else // mtlb a nhi jaanta h b ko
                bflag=false;
            if(mat[b][a]==1) // mtlb b jaanta h a ko
                bflag=false;
            else // mtlb b nhi jaanta h a ko
                aflag=false;
            
            if(aflag==true) st.push(a);
            if(bflag==true) st.push(b);
        }
        
        if(st.size()==0) return -1;
        else{
            int j=st.pop();
            for(int i=0;i<n;i++){
                if(i!=j && (mat[i][j]!=1 || mat[j][i]==1)) return -1;
            }
            return j;
        }
    }
}