package com.test1;

public class Test1 {
//	This is a demo task.
//	Write a function:
//	class Solution { public int solution(int[] A); }
//	that, given an array A of N integers, returns the smallest positive integer (greater than 0) that does not occur in A.
//	For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
//	Given A = [1, 2, 3], the function should return 4.
//	Given A = [−1, −3], the function should return 1.
//	Write an efficient algorithm for the following assumptions:
//	N is an integer within the range [1..100,000];
//	each element of array A is an integer within the range [−1,000,000..1,000,000].
	public static void main(String[] args) {
		Solution s= new Solution();
		int[] A = {1, 2, 3};
		int[] B = {1, 3, 6, 4, 1, 2};
		int[] C = {-1, -3};
		int returnA=s.solution(A);
		System.out.println("returnA="+returnA);
		System.out.println("=====================");
		int returnB=s.solution(B);
		System.out.println("returnB="+returnB);
		System.out.println("=====================");
		int returnC=s.solution(C);
		System.out.println("returnC="+returnC);
	}

}

