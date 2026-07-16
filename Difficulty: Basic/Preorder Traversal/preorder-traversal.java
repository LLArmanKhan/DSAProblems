/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> preOrder(Node root) {
        //  code here
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root,arr);
        return arr;
        
    }
    public void dfs(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        arr.add(root.data);
        dfs(root.left,arr);
        dfs(root.right,arr);
    }
    
}