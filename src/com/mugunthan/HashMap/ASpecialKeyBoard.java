package com.mugunthan.HashMap;

import java.util.HashMap;

public class ASpecialKeyBoard {

	public static void main(String[] args) {
		int findTime = ASpecialKeyBoardSolution.findTime("abcdefghijklmnopqrstuvwxyz", "cba");
		System.out.println(findTime);
	}

}

class ASpecialKeyBoardSolution {
	static int findTime(String S1, String S2) {
		HashMap<Character, Integer> keyPositions = new HashMap<>();
		for (int i = 0; i < S1.length(); i++)
			keyPositions.put(S1.charAt(i), i);
		int noOfSteps = 0;
		int previousPosition = 0;
		for (int i = 0; i < S2.length(); i++) {
			noOfSteps = noOfSteps + Math.abs(previousPosition - keyPositions.get(S2.charAt(i)));
			previousPosition = keyPositions.get(S2.charAt(i));
		}
		return noOfSteps;
	}
};