package com.test;

public class Test {
	public static void main(String[] args) {
		String str = "this is vowels and consonents digits and spaces c94ck";
		int vowels = 0, consonants = 0, digits = 0, spaces = 0, specialChar = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= '0' && ch <= '9') {
				digits++;
			} else if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o'
					|| ch == 'O' || ch == 'u' || ch == 'U') {
				vowels++;
			} else if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				consonants++;
			} else if (ch == ' ') {
				spaces++;
			} else {
				specialChar++;
			}
		}
		System.out.println("*** Output ****");
		System.out.println("Vowels=" + vowels);
		System.out.println("Consonants=" + consonants);
		System.out.println("Digits=" + digits);
		System.out.println("Spaces=" + spaces);
		System.out.println("Special Characters=" + specialChar);
	}
}
