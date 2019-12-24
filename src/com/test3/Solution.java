package com.test3;

public class Solution {
//	Leetcode Reverse Integer    
//	https://leetcode.wang/leetCode-7-Reverse-Integer.html
    public int reverse(int x) {
        int rev = 0;
          while (x != 0) {
              int pop = x % 10;
              x /= 10;
              System.out.println("rev="+rev);
              System.out.println("Integer.MAX_VALUE="+Integer.MAX_VALUE);
              System.out.println("Integer.MIN_VALUE="+Integer.MIN_VALUE);
              if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) 
            	  return 0;
              if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) 
            	  return 0;
              rev = rev * 10 + pop;
              System.out.println("pop="+pop);
          }
          
          return rev;
      }
  }