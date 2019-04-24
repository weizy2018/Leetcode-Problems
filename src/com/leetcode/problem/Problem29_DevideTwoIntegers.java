package com.leetcode.problem;

class Solution29 {
    public int divide(int dividend, int divisor) {
        boolean positive = true;
        int quotient = 0;
        if (divisor == 1) {
        	return dividend;
        } else if (divisor == 0 || (dividend == Integer.MIN_VALUE && divisor == -1)) {
        	return Integer.MAX_VALUE;
        } else if (divisor == 1) {
        	return dividend;
        }
        
        if ((dividend ^ divisor) < 0) {
        	positive = false;
        }
        
        if (dividend > 0)
        	dividend = -dividend;
        if (divisor > 0)
        	divisor = -divisor;
        int half = Integer.MIN_VALUE / 2;
        while (dividend <= divisor) {
        	int tempDivisor = divisor;
        	int temp = 1;
        	int count = 1;
        	dividend -= tempDivisor;
        	while (tempDivisor > half && dividend <= (tempDivisor << 1)) {
        		tempDivisor = tempDivisor << 1;
        		dividend -= tempDivisor;
        		temp <<= 1;
        		count += temp;
        	}
        	quotient += count;
        	
        }
        if (positive) {
        	return quotient;
        } else {
        	return -quotient;
        }
        
    }
}

public class Problem29_DevideTwoIntegers {

	public static void main(String[] args) {

		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.toBinaryString(Integer.MIN_VALUE / 2));
		Solution29 s = new Solution29();
		System.out.println(s.divide(-2147483648, 2));

	}

}
