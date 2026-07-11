/* Structure of a Linked List node
class Node {
    int data;
    Node next;
    Node(int key) {
        data = key;
        next = null;
    }
} */

class Solution {
    public Node mergeSort(Node head) {
        // code here
        if(head.next==null) return head;
        
        Node slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node head2=slow.next;
        slow.next=null;
        head=mergeSort(head);
        head2=mergeSort(head2);
        return merge(head,head2);
    }
    Node merge(Node head1,Node head2){
        Node dummy = new Node(-1);
        Node i=head1,j=head2,k=dummy;
        while(i!=null && j!=null){
            if(i.data>=j.data){
                k.next=j;
                k=j;
                j=j.next;
            }
            else{
                k.next=i;
                k=i;
                i=i.next;
            }
        }
        if(i==null) k.next=j;
        else k.next=i;
        return dummy.next;
    }
}