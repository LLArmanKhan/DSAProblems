class Solution {
    static int max;
    public int diameter(Node root) {
        // code here
        max=Integer.MIN_VALUE;
        levels(root);
        return max;
    }
    static int levels(Node root){
        if(root==null) return 0;
        int llev=levels(root.left);
        int rlev=levels(root.right);
        if(llev+rlev>max) max=llev+rlev;
        return 1+Math.max(llev,rlev);
    }
}