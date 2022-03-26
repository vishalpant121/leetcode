package leetcode;

import java.util.HashSet;

public class IntersectionOfLL  {


    public static void main(String[] args) {

        ListMethods llist1 = new ListMethods();
        ListMethods llist2 = new ListMethods();

        llist1.addToTheLast(new ListMethods.ListNode(4));
        llist1.addToTheLast(new ListMethods.ListNode(1));




        // Node head2 = new Node(2);
        llist2.addToTheLast(new ListMethods.ListNode(5));
        llist2.addToTheLast(new ListMethods.ListNode(6));
        llist2.addToTheLast(new ListMethods.ListNode(1));
        llist2.addToTheLast(new ListMethods.ListNode(8));
        llist2.addToTheLast(new ListMethods.ListNode(4));
        llist2.addToTheLast(new ListMethods.ListNode(5));


        llist1.getLastNode().next = llist2.getNthNode(3);

        llist1.printList();
        llist2.printList();

        llist1.head = getIntersectionNodeBetter(llist1.head, llist2.head);

        llist1.printList();
    }

    public static ListMethods.ListNode getIntersectionNodeBetter(ListMethods.ListNode headA, ListMethods.ListNode headB) {


        if (headA == null || headB == null) {
            return null;
        }

        int a = 0, b = 0;
        ListMethods.ListNode temp;


        temp = headA;
        while(temp != null) {
            a++;
            temp = temp.next;
        }

        temp = headB;
        while(temp != null) {
            b++;
            temp = temp.next;
        }

        if(b>a) {
            while (b > a) {
                headB = headB.next;
                a++;
            }
        } else if ( a> b ){
            while (a > b) {
                headA = headA.next;
                b++;
            }
        }

        while(headA != null && headB != null) {
            if(headA == headB) {
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
    public static ListMethods.ListNode getIntersectionNodeNew(ListMethods.ListNode headA, ListMethods.ListNode headB) {


        if(headA == null || headB == null) {
            return null;
        }
        HashSet<ListMethods.ListNode> set = new HashSet<>();

        while(headA != null && headB != null) {
            if(set.contains(headA)) {
                return headA;
            }

            set.add(headA);
            if(set.contains(headB)) {
                return headB;
            }
            set.add(headB);

            headA = headA.next;
            headB = headB.next;
        }

        while (headA != null) {
            if(set.contains(headA)) {
                return headA;
            }
            headA = headA.next;
        }

        while (headB != null) {
            if(set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }

        return null;
    }

    public static ListMethods.ListNode getIntersectionNode(ListMethods.ListNode headA, ListMethods.ListNode headB) {


        if(headA == null || headB == null) {
            return null;
        }
        HashSet<ListMethods.ListNode> set = new HashSet<>();


        while(headA !=null) {
            set.add(headA);
            headA = headA.next;
        }

        while (headB != null) {
            if(set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }

        return null;
    }


}
