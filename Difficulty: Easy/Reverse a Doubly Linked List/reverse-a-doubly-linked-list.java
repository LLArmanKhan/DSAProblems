/* Structure of doubly linked list node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        if(head.next==null) return head;
        Node current=head;
        Node temp=null,ans=null;
        while(current!=null){
            temp=current.next;
            current.next=current.prev;
            current.prev=temp;
            ans=current;
            current=temp;
        }
        return ans;
    }
}