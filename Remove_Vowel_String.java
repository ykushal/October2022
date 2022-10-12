package com.java.baisc;

public class Remove_Vowel_String {

	
	public static void main(String[] args) {
		String s="kushal";
		String blank="";
		blank = s.replaceAll("[aeiou]", "");
		System.out.println("without vowel string: "+blank);
		
		
	}
}
