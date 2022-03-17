package com.sebone.java.assignment;
import java.util.Scanner;//import some predefine classes or method
/** ClassName : CountDigit
 * Objective: Counting number of digit in given number
 * Date: 17.03.2022
 * @author Devendra Malve
 **/
 

public class CountDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//	Taking input From User
		System.out.println("enter your number:");
		int number = scanner.nextInt();
		//object creation
		CountDigit countDigit = new CountDigit();
		//		Method calling
		System.out.println(countDigit.DigitCount(number));

	}
	
	/*
	 * Method name:DigitCount
	 * Objective : Counting number of digit in given number
	 * @param: int value
	 * @return : int value
	 */
	
	public int DigitCount(int a) {
        int counter =0;
     // Iterate till a  != N 
		while(a!=0) {
			a = a/10;
			counter++;
		}
		return counter;
	}

}
