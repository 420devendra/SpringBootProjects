package com.sebone.java.assignment;
import java.util.Scanner;

/** ClassName : SumNum
 * Date: 17.03.2022
 */ 
/**Date: 17.03.2022
 * objective: sum of all the given series no  as given input
 * @author Devendra Malve
 *
 */

public class  SumNum {
	//sub method 
	
/*Method Name : getNUm
 * objective: using this method we can  add all the number with adding in a variable
 * @param : integer value
 * @return : sum of value
 */
    public int getNum(int snumber) {
    	int i, sum = 0;
    	for(i=1; i<=snumber; i++) {
    		sum = sum+i;
        }
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		//	Taking input From User
		System.out.println("enter your number:");
		int number = scanner.nextInt();
		//creating object
		SumNum sumnumber = new SumNum();
		System.out.print(sumnumber.getNum(number));
		

	}

}
