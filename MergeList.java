class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeList {

    public static ListNode mergeTwoLists(ListNode L1, ListNode L2) {

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (L1 != null && L2 != null) {

            if (L1.val < L2.val) {
                current.next = L1;
                L1 = L1.next;
            } else {
                current.next = L2;
                L2 = L2.next;
            }

            current = current.next;
        }

        if (L1 != null) {
            current.next = L1;
        }

        if (L2 != null) {
            current.next = L2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {

        // List 1: 1 -> 2 -> 4
        ListNode L1 = new ListNode(1);
        L1.next = new ListNode(2);
        L1.next.next = new ListNode(4);

        // List 2: 1 -> 3 -> 4
        ListNode L2 = new ListNode(1);
        L2.next = new ListNode(3);
        L2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(L1, L2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
