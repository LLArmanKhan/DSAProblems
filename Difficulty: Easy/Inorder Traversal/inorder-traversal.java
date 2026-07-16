/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        dfs(root,arr);
        return arr;
    }
    public void dfs(Node root,ArrayList<Integer> arr){
        if(root==null) return;
        dfs(root.left,arr);
        arr.add(root.data);
        dfs(root.right,arr);
    }    
    
}