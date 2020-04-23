package com.study.algorithm.linkNode;

/**
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 *  
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 *
 */
public class LeetCode24 {

    public static void main(String[] args) {
        ListNode node = init();
        node = swapPairs(node);
        System.out.println(node.toString());
    }

    public static ListNode swapPairs(ListNode head) {
        if (null == head || null == head.next) {
            return head;
        }
        ListNode temp = head.next;
        head.next = temp.next;
        temp.next = head;
        head.next = swapPairs(head.next);
        return temp;
    }

    private static ListNode init() {
        ListNode four = new ListNode(4);
        four.setNext(null);
        ListNode three = new ListNode(3);
        three.setNext(four);
        ListNode two = new ListNode(2);
        two.setNext(three);
        ListNode one = new ListNode(1);
        one.setNext(two);
        return one;
    }
}