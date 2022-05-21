package com.mugunthan.Strings;

import java.util.HashMap;

public class TransformString {

	public static void main(String[] args) {
		TransformStringSolution solution = new TransformStringSolution();
		int transform = solution.transform("abcd", "efgh");
		System.out.println(transform);
	}

}

class TransformStringSolution {
	int transform(String A, String B) {
		if (A.length() != B.length())
			return -1;
		HashMap<Character, Integer> freq = new HashMap<>();
		for (int i = 0; i < A.length(); i++) {
			freq.put(A.charAt(i), freq.getOrDefault(A.charAt(i), 0) + 1);
		}
		for (int i = 0; i < B.length(); i++) {
			freq.put(B.charAt(i), freq.getOrDefault(B.charAt(i), 0) - 1);
		}
		for (Character key : freq.keySet()) {
			if (freq.get(key) != 0)
				return -1;
		}
		int j = B.length() - 1;
		for (int i = A.length() - 1; i >= 0; i--) {
			if (A.charAt(i) == B.charAt(j))
				j--;
		}
		return j + 1;
	}
}
