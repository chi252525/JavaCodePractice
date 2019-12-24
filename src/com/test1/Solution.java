package com.test1;


public class Solution {
	public int solution(int[] A) {
		int i,j;
		//ªwªj±Æ§Ç
        for(i=0;i<A.length-1;i++){
            for(j=0;j<A.length-1;j++){
                if(A[j+1]<A[j]){
                    int tmp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=tmp;
                }
            }
        }
        int minValue = 1;
        System.out.println("A[A.length - 1]="+A[A.length - 1]);
        if (A[A.length - 1] > 0)
        {
            for (int h = 0; h < A.length; h++)
            {
            	System.out.println("A[h]="+A[h]);
                if (A[h] == minValue)
                {
                    minValue = minValue + 1;
                    System.out.println("minValue="+minValue);
                }
                if (A[h] > minValue)
                {
                	System.out.println("break");
                    break;
                }
            }
        }

        return minValue;

	}
}
