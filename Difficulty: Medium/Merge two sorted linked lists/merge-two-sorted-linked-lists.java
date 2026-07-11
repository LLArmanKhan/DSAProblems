/*
class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    Node sortedMerge(Node head1, Node head2) {
        // code here
        Node dummy = new Node(-1);
        Node k = dummy;
        Node i=head1,j=head2;
        
        while(i!=null && j!=null){
            if(i.data>=j.data){
                Node n = new Node(j.data);
                k.next=n;
                k=n;
                j=j.next;
            }
            else{
                Node n = new Node(i.data);
                k.next=n;
                k=n;
                i=i.next;
            }
        }
        if(i==null) k.next=j;
        else k.next=i;
        dummy=dummy.next;
        return dummy;
    }
}