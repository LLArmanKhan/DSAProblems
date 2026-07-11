/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    Node merge(Node h1,Node h2){
        Node d = new Node(-1);
        Node i=h1,j=h2,k=d;
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
        return d.next;
    }
    Node mergeKLists(Node[] arr) {
        // code here
        ArrayList<Node> array = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            array.add(arr[i]);
        }
        while(array.size()>1){
            int i=array.size()-1;
            Node temp=merge(array.get(i),array.get(i-1));       
            array.remove(i);
            array.remove(i-1);
            array.add(temp);
        }
        return array.get(0);
    }
}