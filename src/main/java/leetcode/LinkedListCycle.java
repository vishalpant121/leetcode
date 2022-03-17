package leetcode;

import java.util.HashSet;

public class LinkedListCycle {

    /**
     * Definition for singly-linked list.
     * class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) {
     *         val = x;
     *         next = null;
     *     }
     * }
     */

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public static void main(String[] args) {
        //some code for input of cycle and non cycle lists
        //https://leetcode.com/problems/linked-list-cycle/submissions/
    }

    public boolean usingHashSet(ListNode head) {

        HashSet<ListNode> hashSet = new HashSet<>();

        while (head != null) {
            if(!hashSet.contains(head)) {
                hashSet.add(head);
                head = head.next;
            } else {
                return true;
            }
        }

        return false;

    }

    public boolean hasCycle(ListNode head) {

        if(head == null || head.next == null || head.next.next == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) {
                return true;
            }
        }

        return false;

    }

}
