class Solution {
    public void reorderList(ListNode head) {
        ListNode slow = head;        //finding the middle via fast and slow pointers
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode second = slow.next;
        slow.next = null;
        ListNode node = null;

        while(second != null){             //reversing the second half of the list
            ListNode temp = second.next;
            second.next = node;
            node = second;
            second = temp;
        }

        ListNode first = head;
        second = node;

        while(second != null){           //merging it with the first half to get the resultant list
            ListNode temp1 = first.next, temp2 = second.next;
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }
    }
}
