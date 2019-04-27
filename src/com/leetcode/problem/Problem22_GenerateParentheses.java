package com.leetcode.problem;

import java.util.ArrayList;
import java.util.List;

class Solution22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        char[] current = new char[2*n];
        generateAll(current, 0, result);
        return result;
    }
    
    public void generateAll(char[] current, int cnt, List<String> result) {
    	if (cnt == current.length) {
    		if (valid(current)) {
    			result.add(new String(current));
    		}
    	} else {
    		current[cnt] = '(';
    		generateAll(current, cnt+1, result);
    		current[cnt] = ')';
    		generateAll(current, cnt+1, result);
    	}
    }
    public boolean valid(char[] parenthesis) {
    	int cnt = 0;
    	for (char c: parenthesis) {
    		if (c == '(')
    			cnt++;
    		else 
    			cnt--;
    		if (cnt < 0)
    			return false;
    	}
    	return (cnt==0);
    }
}

class Solution22_2 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        generate(result, "", 0, 0, n);
        return result;
    }
    public void generate(List<String> result, String current, int open, int close, int max) {
    	if (current.length() == max*2) {
    		result.add(current);
    		return;
    	}
    	if (open < max)
    		generate(result, current+"(", open+1, close, max);
    	if (close < open)
    		generate(result, current+")", open, close+1, max);
    	
    }

}

public class Problem22_GenerateParentheses {

	public static void main(String[] args) {
//		Solution22 solution = new Solution22();
//		List<String> result = solution.generateParenthesis(3);
//		System.out.println(result.toString());
		
		Solution22_2 s = new Solution22_2();
		List<String> rs = s.generateParenthesis(3);
		System.out.println(rs.toString());

	}

}
