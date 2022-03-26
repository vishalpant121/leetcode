package leetcode;

public class RemoveLLElement {

    public static void main(String[] args) {

    }

    public static ListMethods.ListNode removeElements(ListMethods.ListNode head, int val) {

        if(head == null)
            return null;

        ListMethods.ListNode temp = head;
        if(head.val == val)
            head = head.next;

        while(temp != null) {
            if(temp.next.val == val) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }

        return head;
    }
}
