package com.leetcode.problem;

import java.util.Stack;

class Solution26 {
	
	public boolean test(String str) {
		Stack<Character> s = new Stack<Character>();
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{') {
				s.push(str.charAt(i));
			} else if (str.charAt(i) == ')') {
				if (s.isEmpty()) {
					return false;
				} else {
					char c = s.pop();
					if (c != '(') {
						return false;
					}
				}
			}  else if (str.charAt(i) == ']') {
				if (s.isEmpty()) {
					return false;
				} else {
					char c = s.pop();
					if (c != '[') {
						return false;
					}
				}
			}  else if (str.charAt(i) == '}') {
				if (s.isEmpty()) {
					return false;
				} else {
					char c = s.pop();
					if (c != '{') {
						return false;
					}
				}
			}
		}
		
		return s.isEmpty();
	}
	
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
        	return 0;
        }
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
        	if (nums[j] != nums[i]) {
        		i++;
        		nums[i] = nums[j];
        	}
        }
        return i + 1;
    }
}

public class Problem26_RemoveDuplicates {

	public static void main(String[] args) {
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		Solution26 s = new Solution26();
//		int len = s.removeDuplicates(nums);
//		for (int i = 0; i < len; i++) {
//			System.out.print(nums[i] + " ");
//		}
//		System.out.println();
		String str = "()[] {([]])}";
		System.out.println(s.test(str));

	}

}
