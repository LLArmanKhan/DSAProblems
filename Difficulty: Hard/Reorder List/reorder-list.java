/* Node Structure
class Node {
    int data;
    Node next;
    Node(int x) {
        data = x;
        next = null;
    }
} */

class Solution {
    public Node reverse(Node a){
        if(a.next==null) return a;
        Node prev=null,fwd=null,current=a;
        while(current!=null){
            fwd=current.next;
            current.next=prev;
            prev=current;
            current=fwd;
        }
        return prev;
    }
    public void reorderList(Node head) {
        // code here
        if(head.next==null) return;
        Node slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp1 = head;
        Node temp2 = reverse(slow.next);
        slow.next=null;
        while(temp2!=null){
            Node a = temp1.next;
            Node b = temp2.next;
            temp1.next=temp2;
            temp2.next=a;
            temp1=a;
            temp2=b;
        }
    }
}