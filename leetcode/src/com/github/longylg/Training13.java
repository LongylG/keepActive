package com.github.longylg;

import java.math.BigDecimal;

/**
 * @author liyulong
 * @date 2020-03-16 4:44 下午
 */
public class Training13 {
    public static void main(String[] args) {
//        ListNode node1 = new ListNode(2);
//        ListNode node12 = new ListNode(4);
//        ListNode node13 = new ListNode(3);
//
//        node1.next =node12;
//        node12.next=node13;
//
//        ListNode node2 = new ListNode(5);
//        ListNode node22 = new ListNode(6);
//        ListNode node23 = new ListNode(4);
//        node2.next = node22;
//        node22.next = node23;
//
//        new Training13().addTwoNumbers(node1,node2);

        ListNode node1 = new ListNode(0);


        ListNode node2 = new ListNode(0);


        new Training13().addTwoNumbers(node1, node2);

    }

    /**
     * 不能直接将两数相加然后放到链表中，数字很大的时候会不对
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0);
        ListNode num1 = l1, num2 = l2, curr = result;
        //进位数
        int carry = 0;
        while (num1 != null || num2 != null) {
            int x = (num1 != null) ? num1.val : 0;
            int y = (num2 != null) ? num2.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (num1 != null) {
                num1 = num1.next;
            }
            if (num2 != null) {
                num2 = num2.next;
            }
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return result.next;

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
