/*
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}*/

class Solution {
     public Node reverse(Node a){
        if(a.next==null) return a;
        Node current=a,prev=null,fwd=null;
        while(current!=null){
            fwd=current.next;
            current.next=prev;
            prev=current;
            current=fwd;
        }
        return prev;
    }
    public boolean isPalindrome(Node head) {
        // code here
        if(head==null || head.next==null) return true;
        Node slow=head,fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp1=head;
        Node temp2=reverse(slow.next);
        slow.next=null;
        while(temp2!=null){ //becoz temp2 ki hi length kam hogi
            int a=temp1.data,b=temp2.data;
            if(a!=b) return false;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;
    }
}