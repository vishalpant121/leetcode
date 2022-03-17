package leetcode;

public class Merge2SortedLists {

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

    public static void main(String[] args) {




        Merge2SortedLists llist1 = new Merge2SortedLists();
        Merge2SortedLists llist2 = new Merge2SortedLists();

        // Node head1 = new Node(5);
        llist1.addToTheLast(new ListNode(1));
        llist1.addToTheLast(new ListNode(2));
        //llist1.addToTheLast(new ListNode(15));

        // Node head2 = new Node(2);
        llist2.addToTheLast(new ListNode(2));
        llist2.addToTheLast(new ListNode(3));
        //llist2.addToTheLast(new ListNode(20));


        llist1.head = mergeTwoListsNew(llist1.head,
                llist2.head);
        llist1.printList();

    }


    public static ListNode mergeTwoListsNew(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        return list1.val <= list2.val ?
                new ListNode(list1.val, mergeTwoListsNew(list1.next, list2)) :
                new ListNode(list2.val, mergeTwoListsNew(list1, list2.next));

    }


    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if(list1 == null) {
            return list2;
        } else if(list2 == null) {
            return list1;
        }

        ListNode list, temp;
        if(list1.val <= list2.val) {
            list = list1;
            list1 = list1.next;
        } else {
            list = list2;
            list2 = list2.next;
        }

        temp = list;
        while (list1 != null && list2 !=null) {

            if(list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }

        if (list1 !=null) {
            temp.next = list1;
        }
        if (list2 !=null) {
            temp.next = list2;
        }
        return list;
    }
}


