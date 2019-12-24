package com.test6;

import java.util.HashMap;
import java.util.Map;
public class MainTest {
//	I             1
//	V             5
//	X             10
//	L             50
//	C             100
//	D             500
//	M             1000
//	Given a roman numeral, convert it to an integer.
//	Input is guaranteed to be within the range from 1 to 3999.
//	思路：如果前一个字符代表的数字比后一个小，则sum减去它代表的数字；如果比后一个大，则加上它代表的数字。
//	用hashmap来做，因此每次查找的时间为O(1)，时间复杂度为O(n)，空间复杂度为O(1)
	public static void main(String[] args) {
		Solution s =new Solution();
		int r=s.romanToInt("IV");
		System.out.println(r);
	}

}
class Solution {
    public int romanToInt(String s) {
//    	String a = "abc";
//    	int b[] = new int[a.length()];
//    	for(int i=0; i< a.length(); i++) {
//    	b[i] = a.charAt(i);
//    	System.out.println(a.charAt(i));
//    	System.out.println(b[i]);
//    	}
    	if (s == null || s.length() == 0)
              return -1;
    	Map<Character,Integer> map = new HashMap<>();
    	map.put('I', 1);
    	map.put('V', 5);
    	map.put('X', 10);
    	map.put('L', 50);
    	map.put('C', 100);
    	map.put('D', 500);
    	map.put('M', 1000);
    	int len = s.length();
    	System.out.println("len="+len);
    	System.out.println(s.charAt(len - 1));
    	int result = map.get(s.charAt(len - 1));
    	System.out.println("result="+result);
        for (int i = len - 2; i >= 0; i--) {
            if (map.get(s.charAt(i)) >= map.get(s.charAt(i + 1)))
                result += map.get(s.charAt(i));
            else
                result -= map.get(s.charAt(i));
        }
        return result;
    	
    }
}