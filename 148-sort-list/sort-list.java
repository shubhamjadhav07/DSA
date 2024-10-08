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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode middle= findmiddle(head);
        ListNode middlenext=middle.next;
        middle.next=null;
        ListNode left=sortList(head);
        ListNode right=sortList(middlenext);
        return merge(left,right);
    }
    private ListNode merge(ListNode left,ListNode right){
        if(left==null) return right;
        if(right==null) return left;
        ListNode mergeHead;
        if(right.val<left.val){
            mergeHead=right;
            right=right.next;
        }else{
            mergeHead=left;
            left=left.next;
        }
        ListNode temp=mergeHead;
        while(left!=null && right!=null){
            if(right.val<left.val){
            temp.next=right;
            temp=temp.next;
            right=right.next;
        }else{
            temp.next=left;
            temp=temp.next;
            left=left.next;
        }
        }
        if (left != null) {
            temp.next = left;
        } else {
            temp.next = right;
        }
        return mergeHead;
    }
    private ListNode findmiddle(ListNode head){
        if(head == null) {
            return head;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; 
    }
}