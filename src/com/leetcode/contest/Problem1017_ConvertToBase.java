package com.leetcode.contest;

class Solution1017 {
    public String baseNeg2(int N) {
        if (N == 0)
        	return "0";
        StringBuilder result = new StringBuilder();
        while (N != 0) {
        	int r = N % (-2);
        	N /= -2;
        	if (r < 0) {
        		N += 1;
        		r += 2;
        	}
        	result.append(r);
        }
        
        return result.reverse().toString();
    }
    
}

public class Problem1017_ConvertToBase {

	public static void main(String[] args) {
		Solution1017 s = new Solution1017();
		String result = s.baseNeg2(3);
		System.out.println(result);
		
	}

}
