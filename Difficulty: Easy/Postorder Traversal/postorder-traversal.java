/*
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> postOrder(Node root) {
        // code here
        ArrayList<Integer> arr=new ArrayList<>();
        post(root,arr);
        return arr;
    }
    private static void post(Node root, ArrayList<Integer> arr){
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node front=st.pop();
            arr.add(front.data);
            if(front.left!=null) st.push(front.left);
            if(front.right!=null) st.push(front.right);
        }
        Collections.reverse(arr);
    }
}