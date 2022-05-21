package com.mugunthan.Strings;

public class StringsSum {
	public static void main(String[] args) {
		String ans = StringsSumSolution.stringConcatenation("19999999999", "899999999999");
		System.out.println(ans);
	}
}

class StringsSumSolution {

	public static String stringConcatenation(String num1, String num2) {
		int carry = 0;
		String ans = "";
		int i = num1.length()-1;
		int j = num2.length()-1;
		while(i>=0 && j>=0){
			int sum = num1.charAt(i)-'0' + num2.charAt(j)-'0' + carry;
			if(sum > 9) {
				carry = sum / 10;
				sum = sum % 10;
			}
			else {
				carry=0;
			}
			ans = sum+ans;
			System.out.println(ans);
			i--;
			j--;
		}
		while(i>=0){
			int sum = num1.charAt(i)-'0' + carry;
			if(sum > 9) {
				carry = sum / 10;
				sum = sum % 10;
			}
			else {
				carry=0;
			}
			ans = sum+ans;
			System.out.println(ans+"i");
			i--;
		}
		while(j>=0){
			int sum = num2.charAt(j)-'0' + carry;
			if(sum > 9) {
				carry = sum / 10;
				sum = sum % 10;
			}
			else {
				carry=0;
			}
			ans = sum+ans;
			System.out.println(ans+" j "+carry);
			j--;
		}
		if(carry > 0) ans = carry+ans;
		return ans;
	}

}
