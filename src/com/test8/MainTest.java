package com.test8;

public class MainTest {

	public static void main(String[] args) {
		Solution s=new Solution();
		String r=s.addBinary("1", "11");
		System.out.println(r);
	}

}
class Solution {
    public String addBinary(String a, String b) {
    	int maxLen = Math.max(a.length(), b.length());
    	System.out.println("maxLen="+maxLen);
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = 0; i < maxLen; i++) { 
        	//从右边开始逐位取出字符串 a、b 的字符值 tempA 和 tempB，如果长度不足，则用0替代
            int tempA = a.length() > i ? a.charAt(a.length() - i - 1) - '0' : 0;
            int tempB = b.length() > i ? b.charAt(b.length() - i - 1) - '0' : 0;
            
            System.out.println("tempA="+tempA);
            System.out.println("tempB="+tempB);
            sb.insert(0, (tempA + tempB + carry) % 2);  //在最左侧插入相加结果
            System.out.println("sb="+sb.toString());
            carry = tempA + tempB + carry > 1 ? 1 : 0;  //得到进位
            System.out.println("carry="+carry);
            System.out.println("===========================");
        }
        if (carry == 1) sb.insert(0, 1);  //如果最高位有进位，则最高位还要加一位 1
        return sb.toString();
    }
}