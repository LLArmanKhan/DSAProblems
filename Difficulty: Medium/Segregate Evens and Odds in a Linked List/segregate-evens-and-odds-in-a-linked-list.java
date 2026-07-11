/* Structure of a link list node
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/
class Solution {
    Node divide(Node head) {
        // code here
        Node d1 = new Node(-1);  // even
        Node d2 = new Node(-1);// odd
        Node t1=d1,t2=d2;
        Node temp=head;
        
        while(temp!=null){
            if(temp.data%2==0) {
                t1.next=temp;
                t1=temp;
            }
            else { 
                t2.next=temp;
                t2=temp;
            }
            temp=temp.next;
        }
        t1.next=d2.next;
        t2.next=null;
        return d1.next;
    }
}