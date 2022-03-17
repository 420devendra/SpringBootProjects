package com.sebone.java.assignment;
import java.util.Scanner;
/**ClassName : primenumber
 * return Data Type: True/False
 * Date : 17.03.2022
 * @author Devendra Malve
 *
 */

public class PrimeNumber {
//it is main class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("check a number is it prime or not!");
		 int number;
		 number = scanner.nextInt();
		 PrimeNumber primnumber = new PrimeNumber() ;
		 //condition controller statement
		 if( primnumber.IsPrime(number))
			System.out.println("given no is prime");
		 else
			System.out.println("not prime");
		 
}
	//isprime is sub method of class
/*Method Name : Isprime
 * objectibe: checkin  given number is prime or not 
 * @param : int value
 * @return : true/false
 * 
 */
	public  boolean IsPrime(int pnumber){
		for(int i=2; i<pnumber; i++ ) {
			if(pnumber%i==0){
				return false;
			}
			else {
				return true;		
		    }
	    }
		return false;
	}
}

	
