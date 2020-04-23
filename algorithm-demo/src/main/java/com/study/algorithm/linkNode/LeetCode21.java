package com.study.algorithm.linkNode;


import lombok.Data;

/**
 * 将两个升序链表合并为一个新的升序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 */
public class LeetCode21 {

    public static void main(String[] args) {
        //1->2->4
        ListNode l1 = initLinkNodeOne();
        //1->3->4
        ListNode l2 = initLinkNodeTwo();
        System.out.println(l1.toString());
        System.out.println(l2.toString());
        ListNode listNode = mergeTwoLists(l1, l2);
        System.out.println(listNode);
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (null == l1) {
            return l2;
        }
        if (null == l2) {
            return l1;
        }
        if(l1.val <= l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static ListNode initLinkNodeOne() {
        ListNode three = new ListNode(4);
        three.setNext(null);
        ListNode two = new ListNode(2);
        two.setNext(three);
        ListNode one = new ListNode(1);
        one.setNext(two);
        return one;
    }

    public static ListNode initLinkNodeTwo() {
        ListNode three = new ListNode(4);
        three.setNext(null);
        ListNode two = new ListNode(3);
        two.setNext(three);
        ListNode one = new ListNode(1);
        one.setNext(two);
        return one;
    }

}

