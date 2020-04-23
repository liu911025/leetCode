package com.study.algorithm.linkNode;

import lombok.Data;

@Data
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
