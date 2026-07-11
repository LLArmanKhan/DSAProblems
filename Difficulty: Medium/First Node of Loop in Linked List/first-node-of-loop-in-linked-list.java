/*
class Node {
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
};
*/

class Solution {
    public int cycleStart(Node head) {
        // code here
        Boolean flag=false;
        Node slow=head,fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) {flag=true;break;}
        }
        if(flag==false) return -1;
        Node l=head;
        while(l!=slow){
            l=l.next;
            slow=slow.next;
        }
        return slow.data;
    }
}