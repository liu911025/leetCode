package com.study.algorithm.linkNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 *
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 *
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 *
 */
public class LeetCode19 {

    public static void main(String[] args) {
        ListNode listNode = initLinkNodeOne();
        listNode = removeNthFromEnd2(listNode, 2);
        System.out.println(listNode.toString());
    }

    private static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode current = head;
        int total = 0;
        while (null != current) {
            total++;
            current = current.next;
        }
        int index = total - n;
        current = pre;
        while (index > 0) {
            current = current.next;
            index--;
        }
        current.next = current.next.next;
        return pre.next;
    }

    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;
        // Advances first pointer so that the gap between first and second is n nodes apart
        for (int i = 1; i <= n + 1; i++) {
            first = first.next;
        }
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return dummy.next;
    }

    public static ListNode initLinkNodeOne() {
        ListNode five = new ListNode(5);
        five.setNext(null);
        ListNode four = new ListNode(4);
        four.setNext(five);
        ListNode three = new ListNode(3);
        three.setNext(four);
        ListNode two = new ListNode(2);
        two.setNext(three);
        ListNode one = new ListNode(1);
        one.setNext(two);
        /*ListNode two = new ListNode(2);
        two.setNext(null);
        ListNode one = new ListNode(1);
        one.setNext(two);*/
        return one;
    }
}
