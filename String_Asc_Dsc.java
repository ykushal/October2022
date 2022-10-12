package com.java.baisc;

import java.util.Arrays;

public class String_Asc_Dsc {
	
	public static void main(String[] args) {
	
		//-------------------------DESC------------------------
//		char[] s= "kushal".toCharArray();
//        descOrder(s);
//
//        System.out.println(String.valueOf(s));
//	}
//
//	private static void descOrder(char[] s) {
//		 Arrays.sort(s);
//	        reverse(s);		
//	}
//
//	private static void reverse(char[] a) {
//		  int i, n = a.length;
//	        char t;
//	        for (i = 0; i < n / 2; i++)
//	        {
//	            t = a[i];
//	            a[i] = a[n - i - 1];
//	            a[n - i - 1] = t;
//	        }
//		

		String str = "yadav";
		char[] ch= str.toCharArray();
		Arrays.sort(ch);
		System.out.println(new String(ch));
	}

}
