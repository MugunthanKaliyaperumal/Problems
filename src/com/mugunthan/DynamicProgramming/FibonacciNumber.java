package com.mugunthan.DynamicProgramming;

import java.util.Arrays;

public class FibonacciNumber {

	public static void main(String[] args) {
		Solution ob = new Solution();
		int fib = ob.fib(6);
		System.out.println(fib);
	}
	static class Solution {
	    int dp[];
	    int fiboUtil(int n){
	        if(n==0) return 0;
	        if(n==1) return 1;
	        if(dp[n]!=-1) return dp[n];
	        dp[n] = fiboUtil(n-1) + fiboUtil(n-2);
	        return dp[n];
	    }
	    public int fib(int n) {
	        int ans = 0;
	        dp = new int[n+1];
	        Arrays.fill(dp,-1);
	        ans = fiboUtil(n);
	        return ans;
	    }
	}
}
