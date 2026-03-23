/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode d=new ListNode(0);
        ListNode h=d;
        int c=0;
        l1=reverse(l1);
        l2=reverse(l2);
        while(l1!=null || l2 !=null || c!=0){
            int s=c;
            
            if(l1!=null){
                s+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                s+=l2.val;
                l2=l2.next;
            }
            int x=s%10;
            c=s/10;
            h.next=new ListNode(x);
            h=h.next;

        }
        
        return reverse(d.next);
        
    }
    public ListNode reverse(ListNode l){
        ListNode prev=null;
        ListNode c= l;
        while(c!=null){
            ListNode node= c.next;
            c.next=prev;
            prev=c;
            c=node;
        }
        return prev;
    }
}