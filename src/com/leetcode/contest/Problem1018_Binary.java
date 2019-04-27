package com.leetcode.contest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

class Solution1018 {
    public List<Boolean> prefixesDivBy5(int[] A) {
        List<Boolean> result = new ArrayList<Boolean>();
        BigInteger big = new BigInteger("0");
        BigInteger five = new BigInteger("0");
        for (int i = 0; i < A.length; i++) {
        	big = big.multiply(new BigInteger("2"));
        	big = big.add(new BigInteger(Integer.toString(A[i])));
        	if (big.mod(new BigInteger("5")).equals(five)) {
        		result.add(true);
        	} else {
        		result.add(false);
        	}
        }
        return result;
    }
}

public class Problem1018_Binary {

	public static void main(String[] args) {
		int[] A = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
		Solution1018 s = new Solution1018();
		List<Boolean> result = s.prefixesDivBy5(A);
		System.out.println(result.toString());

	}

}
