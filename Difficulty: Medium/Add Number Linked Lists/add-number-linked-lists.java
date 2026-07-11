/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
*/

class Solution {
    public Node reverse(Node a){
        Node current=a,prev=null,fwd=null;
        while(current!=null){
            fwd=current.next;
            current.next=prev;
            prev=current;
            current=fwd;
        }
        return prev;
    }
    public Node addTwoLists(Node head1, Node head2) {
        // code here
        Node dummy = new Node(0);
        Node temp = dummy;
        
        while(head1!=null && head1.data==0)
            head1=head1.next;
        while(head2!=null && head2.data==0)
            head2=head2.next;
        
        
        Node temp1=reverse(head1),temp2=reverse(head2);
        int carry=0;
        
        while(temp1!=null || temp2!=null || carry>0){
            int sum=carry;
            if(temp1!=null){
                sum+=temp1.data;
                temp1=temp1.next;
            }
            if(temp2!=null){
                sum+=temp2.data;
                temp2=temp2.next;
            }
            temp.next=new Node(sum%10);
            temp=temp.next;
            carry=sum/10;
        }
        Node ans = reverse(dummy.next);
        if(ans==null) return dummy;
        return ans;
    }
}