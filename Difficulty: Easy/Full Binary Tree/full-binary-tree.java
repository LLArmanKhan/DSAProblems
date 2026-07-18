/*Complete the function below
Node is as follows:
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
};
*/
class Solution {
    public boolean isFullTree(Node root) {
        // code here
        return check(root);
    }
    public static boolean check(Node root){
        if(root==null) return true;
        if(root.left==null && root.right==null) return true;
        if(root.left==null || root.right==null) return false;
        return check(root.left)&&check(root.right);
    }
}