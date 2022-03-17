package com.sebone.java.assignment;
/** ClassName : Factorial
 * objective:creatin factorial number of given number
 * Date: 17.03.2022
 * @author Devendra Malve
 */
public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =5,factorialnum =1;
		// Iterate till i is <= N 
		for(int i=1; i<=num; i++ ) {
			factorialnum = factorialnum*i;	
		}
		System.out.print("factorial of "+ num + " is :"+ factorialnum);
	}

}


