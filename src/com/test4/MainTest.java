package com.test4;


public class MainTest {

	public static void main(String[] args) {
		Solution s =new Solution();
		boolean r=s.isPalindrome(1);
		System.out.println(r);
	}
    
}
class Solution{
public boolean isPalindrome(int x) {
	int num = x, reversedInteger = 0, remainder, originalInteger;
    originalInteger = num;
    // reversed integer is stored in variable 
    while( num != 0 )
    {
        System.out.println("num="+num);
    	remainder = num % 10;
        System.out.println("remainder="+remainder);
        reversedInteger = reversedInteger * 10 + remainder;
        System.out.println("reversedInteger="+reversedInteger);
        num  /= 10;
    }
    // palindrome if orignalInteger and reversedInteger are equal
    if (originalInteger == reversedInteger) {
        System.out.println(originalInteger + " is a palindrome.");
    return true;
    }else {
        System.out.println(originalInteger + " is not a palindrome.");
    return false;
    }  
    }
}