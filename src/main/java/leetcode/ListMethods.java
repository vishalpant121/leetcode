package leetcode;

public class ListMethods {

    public static class ListNode {
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

    ListNode head;


    void printList()
    {
        ListNode temp = head;
        while (temp != null)
        {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public ListNode getNthNode(int n)
    {
        if (head == null)
        {
            return head;
        }
        else
        {
            ListNode temp = head;
            int i=0;
            while (i< n && temp.next != null) {
                temp = temp.next;
                i++;
            }
            return temp;
        }
    }

    public ListNode getLastNode()
    {
        if (head == null)
        {
            return head;
        }
        else
        {
            ListNode temp = head;
            while (temp.next != null)
                temp = temp.next;
            return temp;
        }
    }

    public void addToTheLast(ListNode node)
    {
        if (head == null)
        {
            head = node;
        }
        else
        {
            ListNode temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
}
