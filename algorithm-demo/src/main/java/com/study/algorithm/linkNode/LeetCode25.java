package com.study.algorithm.linkNode;

/**
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 *
 * k 是一个正整数，它的值小于或等于链表的长度。
 *
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 *
 *  
 *
 * 示例：
 *
 * 给你这个链表：1->2->3->4->5
 *
 * 当 k = 2 时，应当返回: 2->1->4->3->5
 *
 * 当 k = 3 时，应当返回: 3->2->1->4->5
 *
 */
public class LeetCode25 {

    public static void main(String[] args) {
        ListNode node = init();

    }

    public static ListNode reverseKGroup(ListNode head, int k) {
        return null;
    }

    private static ListNode init() {
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
        return one;
    }
}
