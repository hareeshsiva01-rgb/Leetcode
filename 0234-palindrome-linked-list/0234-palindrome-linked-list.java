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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next  == null){
            return true;
        }
        ListNode s=head;
        ListNode f=head;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }
        ListNode fh=head;
        ListNode sh=reverse(s);
        while(sh !=null){
            if(fh.val != sh.val){
                return false;
            }
            fh=fh.next;
            sh=sh.next;
        }
        return true;
    }
    private ListNode reverse(ListNode h){
    ListNode prev=null;
    ListNode curr=h;
    while(curr != null ){
        ListNode n=curr.next;
        curr.next=prev;
        prev=curr;
        curr=n;
    }
    return prev;
    }
}