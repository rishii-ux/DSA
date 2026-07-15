/* Structure of linked list Node
class Node{
    int data;
    Node next;

    Node(int a){
        data = a;
        next = null;
    }
}
*/
class Solution {
    public int getCount(Node head) {
        // code here
        int ctr=0;
        Node curr=head;
        while(curr!=null){
            ctr++;
            curr=curr.next;
        }
        return ctr;
    }
}