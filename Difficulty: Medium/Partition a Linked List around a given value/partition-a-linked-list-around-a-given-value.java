/* Structure of linked list Node
class Node {
  public:
    int data;
    Node* next;

    Node(int x) {
        data = x;
        next = null;
    }
};
*/
class Solution {
    public Node partition(Node head, int x) {
        // code here
        Node d1 = new Node(-1); //less
        Node d2 = new Node(-1); //equal
        Node d3 = new Node(-1); //greater
        Node t1=d1,t2=d2,t3=d3;
        
        Node newhead1=null,newhead2=null,newhead3=null;
        Node temp = head;
        Node ans=null;
        
        while(temp!=null){
            if(temp.data>x){
                if(newhead3==null) newhead3=temp;
                t3.next=temp;
                t3=temp;
            }
            else if(temp.data<x){
                if(newhead1==null) newhead1=temp;
                t1.next=temp;
                t1=temp;
            }
            else{
                if(newhead2==null) newhead2=temp;
                t2.next=temp;
                t2=temp;
            }
            temp=temp.next;
        }
        
        t3.next=null;
        t2.next=d3.next;
        t1.next=d2.next;
        
        return d1.next;
    }
};