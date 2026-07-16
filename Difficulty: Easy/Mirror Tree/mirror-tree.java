/*
class Node
{
    int data;
    Node left, right;
    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/

class Solution {
    void mirror(Node root) {
        // code here
        if(root==null) return;
        mirror(root.left);
        mirror(root.right);
        Node temp=root.right;
        root.right=root.left;
        root.left=temp;
    }
}