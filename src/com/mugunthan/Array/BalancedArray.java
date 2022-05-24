package com.mugunthan.Array;

import java.util.LinkedList;
import java.util.List;

public class BalancedArray {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(6);
		int findPivot = Solution.findPivot(list);
		System.out.println(findPivot);
	}
	
	static class Solution{
		static int findPivot(List<Integer> list) {
			int result = -1;
			int right_sum = 0,left_sum=0;
			for(int i = 1;i<list.size();i++) {
				right_sum+=list.get(i);
			}
			for(int i=0,j=1;j<list.size();i++,j++) {
				right_sum-=list.get(j);
				left_sum+=list.get(i);
				if(left_sum==right_sum) {
					return list.get(i+1);
				}
			}
			
			return result;
		}
	}

}
