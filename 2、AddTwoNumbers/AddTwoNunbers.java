package com.example.demo;

/**
 * https://leetcode-cn.com/problems/add-two-numbers/
 * 两数相加
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class AddTwoNunbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        boolean isCarry = false;
        ListNode tempNode = null;
        ListNode result = null;
        while (l1 != null || l2 != null){
            int temp = isCarry ? 1 : 0;
            if (l1 != null){
                temp += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                temp += l2.val;
                l2 = l2.next;
            }
            if (temp >= 10){
                isCarry = true;
                temp = temp % 10;
            }else {
                isCarry = false;
            }
            if (tempNode == null){
                result = new ListNode(temp);
                tempNode = result;
            }else {
                tempNode.next = new ListNode(temp);
                tempNode = tempNode.next;
            }
        }
        if (isCarry){
            tempNode.next = new ListNode(1);
        }
        return result;
    }
}
