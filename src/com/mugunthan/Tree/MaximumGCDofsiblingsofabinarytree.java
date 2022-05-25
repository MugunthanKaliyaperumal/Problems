package com.mugunthan.Tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MaximumGCDofsiblingsofabinarytree {

	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
		ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
		arrayList1.add(4);
		arrayList1.add(1);
		ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
		arrayList2.add(4);
		arrayList2.add(2);
		ArrayList<Integer> arrayList3 = new ArrayList<Integer>();
		arrayList3.add(2);
		arrayList3.add(3);
		ArrayList<Integer> arrayList4 = new ArrayList<Integer>();
		arrayList4.add(2);
		arrayList4.add(1);
		ArrayList<Integer> arrayList5 = new ArrayList<Integer>();
		arrayList5.add(3);
		arrayList5.add(6);
		ArrayList<Integer> arrayList6 = new ArrayList<Integer>();
		arrayList6.add(3);
		arrayList6.add(12);
		arr.add(arrayList1);
		arr.add(arrayList2);
		arr.add(arrayList3);
		arr.add(arrayList4);
		arr.add(arrayList5);
		arr.add(arrayList6);
		int maxBinTreeGCD = Solution.maxBinTreeGCD(arr, 0);
		System.err.println(maxBinTreeGCD);
	}
	

	static class Solution {
	    static int maxBinTreeGCD(ArrayList<ArrayList<Integer>> arr, int N) {
	        // code here
	        int maxGCD = 0;
	        HashMap<Integer,List<Integer>> tree = new HashMap<>();
	        for( int i = 0 ; i < arr.size() ; i++ ){
	            if(tree.containsKey(arr.get(i).get(0))){
	                List<Integer> newList = tree.get(arr.get(i).get(0));
	                newList.add(arr.get(i).get(1));
	                tree.put(arr.get(i).get(0),newList);
	            }
	            else{
	                List<Integer> newList = new ArrayList<>();
	                newList.add(arr.get(i).get(1));
	                tree.put(arr.get(i).get(0),newList);
	            }
	        }
	        for(Integer key:tree.keySet()){
	            List<Integer> listOfChild = tree.get(key);
	            if(listOfChild.size() == 2 ){
	                int child1 = listOfChild.get(0);
	                int child2 = listOfChild.get(1);
	                maxGCD = Math.max(maxGCD,getGCD(child1,child2));
	            }
	        }
	        return maxGCD;
	    }
	    
	    static int getGCD(int n1,int n2){
	        if(n2==0){
	            return n1;
	        }
	        return getGCD(n2,n1 % n2);
	    }
	};

}
