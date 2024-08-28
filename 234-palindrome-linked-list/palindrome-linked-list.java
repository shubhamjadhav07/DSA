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
     ListNode slow=head;
     ListNode fast = head;
     while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
     } 
     if(fast!=null){
        slow=slow.next;
     }  
     ListNode mid=slow;
     ListNode prev=null;
     while(mid!=null){
        ListNode temp= mid.next;
        mid.next=prev;
        prev=mid;
        mid=temp;
     }
     ListNode start=head;
     while(start!=null && prev!=null){
        if(start.val!=prev.val){
            return false;
        }
        start=start.next;
        prev=prev.next;
     }
     return true;
    }
}