package com.study.algorithm.linkNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 *
 * 示例:
 *
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 *
 */
public class LeetCode23 {

    public static void main(String[] args) {
        ListNode[] listNodes = init();
        ListNode node = mergeKLists(listNodes);
        System.out.println(node.toString());
    }

    public static ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        if (lists.length == 0) {
            return null;
        }
        for (ListNode listNode : lists) {
            if (null == listNode) {
                continue;
            }
            list.add(listNode.val);
            while (null != listNode.next) {
                list.add(listNode.next.val);
                listNode = listNode.next;
            }
        }
        Collections.sort(list);
        ListNode first = new ListNode(0);
        ListNode temp = first;
        for (Integer i : list) {
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        return first.next;
    }

    private static ListNode[] init() {
        ListNode[] listNodes = new ListNode[3];
        listNodes[0] = initLinkNodeOne();
        listNodes[1] = initLinkNodeTwo();
        listNodes[2] = initLinkNodeThere();
        return listNodes;
    }

    public static ListNode initLinkNodeOne() {
        ListNode five = new ListNode(5);
        five.setNext(null);
        ListNode four = new ListNode(4);
        four.setNext(five);
        ListNode one = new ListNode(1);
        one.setNext(four);
        return one;
    }

    public static ListNode initLinkNodeTwo() {
        ListNode four = new ListNode(4);
        four.setNext(null);
        ListNode there = new ListNode(3);
        there.setNext(four);
        ListNode one = new ListNode(1);
        one.setNext(there);
        return one;
    }

    public static ListNode initLinkNodeThere() {
        ListNode six = new ListNode(6);
        six.setNext(null);
        ListNode two = new ListNode(2);
        two.setNext(six);
        return two;
    }
}
