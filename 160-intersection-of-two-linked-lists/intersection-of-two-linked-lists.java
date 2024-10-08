/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    if(headA == null || headB == null) return null;
    int count1=0;
    int count2=0;
    ListNode curr1=headA;
    ListNode curr2=headB;
    while(curr1!=null){
        curr1=curr1.next;
        count1++;
    }
    while(curr2!=null){
        curr2=curr2.next;
        count2++;
    }
    curr1=headA;
    curr2=headB;
    if(count2>count1){
        int diff=count2-count1;
        for(int i=0;i<diff;i++){
            curr2=curr2.next;
        }
    }else{
        int diff=count1-count2;
        for(int i=0;i<diff;i++){
            curr1=curr1.next;
        }
    }
    while(curr2!=curr1){
        curr1=curr1.next;
        curr2=curr2.next;
    }
    return curr1;
}
}