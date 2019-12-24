package com.test11;

public class MainTest {
//	387. First Unique Character in a String
	public static void main(String[] args) {
		Solution s= new Solution();
		int ans=s.firstUniqChar("loveleetcode");
		System.out.println("ans="+ans);
	}

}
class Solution {
    public int firstUniqChar(String s) {
    	   int[] counts = new int[26];
           for (char item : s.toCharArray()) {
               counts[item - 'a']++;
           }
           int index = 0;
           for (char item : s.toCharArray()) {
               if (counts[item - 'a'] == 1) {
                   return index;
               }
               index++;
           }
           return -1;
       }
        
    }
