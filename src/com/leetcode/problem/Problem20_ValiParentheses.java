package com.leetcode.problem;

import java.util.Stack;

class Solution20 {
    public boolean isValid(String s) {
        boolean flag = true;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
        	//'(', ')', '{', '}', '[' and ']'
        	char index = s.charAt(i);
        	if (index == '(' || index == '{' || index == '[') {
        		stack.push(index);
        	} else {
        		if (stack.isEmpty()) {
        			flag = false;
        			break;
        		}
        		char temp = stack.pop();
        		if (index == ')') {
        			if (temp != '(') {
        				flag = false;
        				break;
        			}
        			
        		} else if (index == '}') {
        			if (temp != '{') {
        				flag = false;
        				break;
        			}
        			
        		} else if (index == ']') {
        			if (temp != '[') {
        				flag = false;
        				break;
        			}
        		}
        	}
        }
        if (!stack.isEmpty()) {
        	flag = false;
        }
        
        return flag;
    }
}

public class Problem20_ValiParentheses {

	public static void main(String[] args) {
		String str = "()[]";
		System.out.println(new Solution20().isValid(str));

	}

}
