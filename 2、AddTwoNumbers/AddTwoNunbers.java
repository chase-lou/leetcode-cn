package com.example.demo;

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
