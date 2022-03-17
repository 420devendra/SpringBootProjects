package com.sebone.java.assignment;

import java.util.*;
/** ClassName : ReverseString
/**Date : 17.03.2022
 * objective : converting given string to reverse string
 * @author Devendra Malve
 */
public class ReverseString {
				//sub method of class
/*Method Name: strReverse
 * objective: strReverse using this project we can convert given string to reverse string
 * @param : string
 * @return : reversed string
 */

	public static String strReverse(String a) {
		String rstring = "" ;
		// Iteration
		for (int i = a.length()-1; i>=0; i--) {
			rstring = rstring + a.charAt(i);
		}
		return rstring;
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a string:");
		String string = scanner.next();
		//object creating
		ReverseString reversestring = new ReverseString();
		System.out.println(reversestring.strReverse(string));
		
		}
	}
