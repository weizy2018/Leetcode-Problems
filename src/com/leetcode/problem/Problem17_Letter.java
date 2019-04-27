package com.leetcode.problem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Solution17 {
	String[] two = {"a", "b", "c"};
    String[] three = {"d", "e", "f"};
    String[] four = {"g", "h", "i"};
    String[] five = {"j", "k", "l"};
    String[] sex = {"m", "n", "o"};
    String[] seven = {"p", "q", "r", "s"};
    String[] eight = {"t", "u", "v"};
    String[] nine = {"w", "x", "y", "z"};
    
    List<String> result = new ArrayList<String>();
    
    public List<String> letterCombinations(String digits) {
        List<String[]> input = new ArrayList<String[]>();
        for (int i = 0; i < digits.length(); i++) {
        	switch(digits.charAt(i)) {
        	case '2': input.add(two); break;
        	case '3': input.add(three); break;
        	case '4': input.add(four);break;
        	case '5': input.add(five);break;
        	case '6': input.add(sex);break;
        	case '7': input.add(seven);break;
        	case '8': input.add(eight);break;
        	case '9': input.add(nine);break;
        	}
        }
        for (int i = 0; i < digits.length(); i++) {
        	List<String> tempList = new ArrayList<String>();
        	if (i == 0) {
        		for (int j = 0; j < input.get(0).length; j++) {
        			result.add(input.get(0)[j]);
        		}
        	} else {
        		for (int j = 0; j < result.size(); j++) {
        			for (int k = 0; k < input.get(i).length; k++) {
        				String temp = result.get(j);
        				temp += input.get(i)[k];
        				tempList.add(temp);
        			}
        		}
        		result = tempList;
        	}
        }
        
        return result;
    }
}
public class Problem17_Letter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String digits = sc.next();
		List<String> list = new Solution17().letterCombinations(digits);
		System.out.println(list.toString());
		
		sc.close();
	}

}
