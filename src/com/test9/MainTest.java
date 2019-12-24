package com.test9;

import java.util.ArrayList;
import java.util.List;

public class MainTest {
//	989. Add to Array-Form of Integer
//	Input: A = [1,2,0,0], K = 34
//			Output: [1,2,3,4]
//			Explanation: 1200 + 34 = 1234
	public static void main(String[] args) {
		Solution s= new Solution();
		int[] A= {1,2,0,0};
		int K = 34;
		System.out.println("=====================");
		List<Integer> i=s.addToArrayForm(A, K);
		for(Integer a:i) {
			System.out.println(a);
		}
	}

}
class Solution {
    public List<Integer> addToArrayForm(int[] A, int K) {
     	int intA=0;
    	int len=A.length;
    	for(int i=0;i<A.length;i++) {
    		System.out.println("len="+len);
    		intA+=A[i]*len;
    		System.out.println("intA="+intA);
    		len--;
    	}
    	System.out.println("==============");
    	System.out.println("intA="+intA);
    	int intr=intA+K;
    	System.out.println("intr="+intr);
    	List<Integer> rlist= new ArrayList<>();

    	while( intr != 0 )
        {
            System.out.println("num="+intr);
        	int remainder = intr % 10;
        	rlist.add(remainder);
            intr  /= 10;
        }
    	
		return rlist;
        
    }
}