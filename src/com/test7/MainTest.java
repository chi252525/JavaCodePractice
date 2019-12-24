package com.test7;


public class MainTest {
	public static void main(String[] args) {
	Solution s =new Solution();
	String[] arr= {"flower","flow","flight"};
	String r=s.longestCommonPrefix(arr);
	System.out.println(r);
	}
}
class Solution {
    public String longestCommonPrefix(String[] strs) {
    	if (strs.length == 0) {
            return "";
        }
    	String curPrefix = strs[0];
    	System.out.println("curPrefix="+curPrefix);
        
        for (int i = 1; i < strs.length; i++) {
        	System.out.println("strs["+i+"]"+strs[i]);
        	System.out.println(strs[i].indexOf(curPrefix));
            while (strs[i].indexOf(curPrefix) != 0) {
            	System.out.println(curPrefix.substring(0, curPrefix.length() - 1));
                curPrefix = curPrefix.substring(0, curPrefix.length() - 1);
                
                if (curPrefix.isEmpty()) {
                    return "";
                }
            }
        }
        return curPrefix;
        
    }
}