package com.mugunthan.Array;

import java.util.Arrays;

public class FarthestNumber {

	public static void main(String[] args) {
		
		int arr[] = {3, 1, 5, 2, 4};
		int n = arr.length;
		int ans[] = Solution.farNumber(n,arr);
		System.out.println(Arrays.toString(ans));
	}

	static class Solution 
	{ 
	    static int[] farNumber(int N, int Arr[])
		{    
	        int ans[] = new int[N];
	        for(int i = 0 ; i < N ; i++){
	            int indexAns = -1;
	            for(int j = N-1; j > i ; j--){
	                if(Arr[j] < Arr[i]){
	                    indexAns = j;
	                    break;
	                }
	            }
	            ans[i] = indexAns;
	        }
	        return ans;
		}
	} 

}


