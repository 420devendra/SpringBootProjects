package com.sebone.java.assignment;
import java.util.Scanner;//import some predefine classes or method
/** ClassName : FibonacciSeries
 * objective:Creating Fibonacci Series  Upto Given Number
 * Date: 17.03.2022
 *@author Devendra Malve
 */
public class FibonacciSeries {
	// Function to print N Fibonacci Number 
     public void fibonacci(int N) { 
        int num1 = 0, num2 = 1; 
        int counter = 0; 
        // Iterate till counter is N 
        while (counter < N) { 
        	// Print the number 
        	System.out.print(num1 + " "); 
            // Swap 
            int num3 = num2 + num1; 
            num1 = num2; 
            num2 = num3; 
            counter = counter + 1; 
        } 
     } 
     
/* Method name:DigitCount
* Objective : Creating Fibonacci Series  Upto Given Number
* @param: int value
* @return : int value 
*/

     public static void main(String args[]) { 
    	// Given Number N 
    	Scanner scanner = new Scanner(System.in);
		System.out.println("enter your number:");
		int number = scanner.nextInt();
		FibonacciSeries fs = new FibonacciSeries();
		// Method Calling	
		fs.fibonacci(number);
	} 
}



