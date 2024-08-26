class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }    
        if (n == size) {
            head = head.next;
            return head;
        }
        int positionToRemove = size - n + 1;
        ListNode prev = null;
        temp = head;
        for (int i = 1; i < positionToRemove; i++) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;

        return head;
    }
}