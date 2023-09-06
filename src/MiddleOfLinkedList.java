//876. Middle of the Linked List
// Completed by Zachary Hopp 9/06/2023
// Time Complexity: O(n)
// Space Complexity: O(1)

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MiddleOfLinkedList {

    public static ListNode middleNode(ListNode head) {
        ListNode middle = head;
        ListNode end = head;


        while (end != null && end.next != null) {
            middle = middle.next;
            end = end.next.next;
        }


        return middle;
    }

}