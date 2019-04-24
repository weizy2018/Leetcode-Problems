package com.leetcode.problem;

class Solution21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    	ListNode head = new ListNode(0);
    	head.next = null;
    	ListNode p = head;
    	while (l1 != null && l2 != null) {
    		ListNode node;
    		if (l1.val <= l2.val) {
    			node = new ListNode(l1.val);
    			l1 = l1.next;
    		} else {
    			node = new ListNode(l2.val);
    			l2 = l2.next;
    		}
    		node.next = null;
			p.next = node;
			p = node;
    	}
    	while (l1 != null) {
    		ListNode node = new ListNode(l1.val);
    		node.next = null;
    		p.next = node;
    		p = node;
    		l1 = l1.next;
    	}
    	while (l2 != null) {
    		ListNode node = new ListNode(l2.val);
    		node.next = null;
    		p.next = node;
    		p = node;
    		l2 = l2.next;
    	}
        
    	return head.next;
    }
}

public class Problem21_Merge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(0);
		ListNode p = l1;
		for (int i = 1; i < 10; i += 2) {
			ListNode node = new ListNode(i);
			node.next = null;
			p.next = node;
			p = node;
		}
		p = l2;
		for (int i = 2; i <= 10; i += 2) {
			ListNode node = new ListNode(i);
			node.next = null;
			p.next = node;
			p = node;
		}
		p = l1.next;
		while (p != null) {
			System.out.print("->" + p.val);
			p = p.next;
		}
		System.out.println();
		p = l2.next;
		while (p != null) {
			System.out.print("->" + p.val);
			p = p.next;
		}
		System.out.println();
		Solution21 s = new Solution21();
		ListNode head = s.mergeTwoLists(l1, l2);
		p = head;
		while (p != null) {
			System.out.print("->" + p.val);
			p = p.next;
		}
		System.out.println();
	}

}
