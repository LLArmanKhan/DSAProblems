/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/

class Solution {
    public boolean isSymmetric(Node root) {
        // code here
        mirror(root.left);
        return identical(root.left,root.right);
    }
    public boolean identical(Node r1,Node r2){
        if(r1==null && r2==null) return true;
        if(r1==null || r2==null) return false;
        if(r1.data!=r2.data) return false;
        return identical(r1.left,r2.left) && identical(r1.right,r2.right);
    }
    public void mirror(Node r){
        if(r==null) return;
        Node temp=r.left;
        r.left=r.right;
        r.right=temp;
        mirror(r.left);
        mirror(r.right);
    }
}