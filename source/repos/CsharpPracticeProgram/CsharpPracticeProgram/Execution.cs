using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CsharpPracticeProgram
{
    internal class Execution
    {
        public static void Main()
        {
            Console.WriteLine("press 1 for check string anagram!");
            Console.WriteLine("press 2 for sum of n number!");
            Console.WriteLine("press 3 for find factorial number !");
            Console.WriteLine("press 4 for Two sum problem!");
            Console.WriteLine("press 5 for String Reverse Program!");
            Console.WriteLine("press 6 for check number is prime or not!");
            int input = int.Parse(Console.ReadLine());
            switch(input )
            {
                case 1:
                    {
                        Anagram checkAnagram = new Anagram();
                        Console.WriteLine("Please Enter First String to Check Whether is Anagram or not:");
                        string input1 = Console.ReadLine();
                        Console.WriteLine("Please Enter Second String to Check Whether is Anagram or not:");
                        string input2 = Console.ReadLine();
                        Console.WriteLine(checkAnagram.checkAnagramString(input1, input2));
                        break;
                    }
                case 2:
                    {
                        SumNumber sumNuber = new SumNumber();
                        Console.WriteLine("Please Enter Which N Number of Sum You Want to:");
                        int  inputNumber = int.Parse(Console.ReadLine());
                        Console.WriteLine(sumNuber.sumOfNumbers(inputNumber));
                        break;
                    }
                case 3:
                    {
                        Factorial factorial = new Factorial();
                        Console.Write("Please Enter Which Number of Factorial you Want to: ");
                        int factorialNumber = int.Parse(Console.ReadLine());
                        Console.WriteLine(factorial.findFactorialNumber(factorialNumber));
                        break;
                    }
                case 4:
                    {
                        int[] arr = { 10, 5, 4, 6, 7, 8, 1, 12 };
                        Console.Write("Please Enter Which Sum Number you want to: ");
                        var target = int.Parse(Console.ReadLine());
                        TwoSum twoSum = new TwoSum();
                        bool result = twoSum.twoSumProblem(arr, target);
                        if (result)
                            {
                            Console.WriteLine("yes!");

                            }
                        else
                            Console.WriteLine("no!");
                        break;
                    }
                case 5:
                    {
                        StringReverse stringReverse = new StringReverse();
                        Console.Write("Please Enter String to reverse : ");
                        string strInput = Console.ReadLine();
                        string strOutput = stringReverse.reverseString(strInput);
                        Console.WriteLine(strOutput);
                        break;
                    }
                case 6:
                    {
                        CheckPrimeNumber checkPNumber = new CheckPrimeNumber();
                        Console.Write("Please Enter Which Number you want to check whether is prime or not : ");
                        int primeNumberInput = int.Parse(Console.ReadLine());
                        if (checkPNumber.checkPrimeNumber(primeNumberInput)) 
                            {
                            Console.WriteLine("given number is prime");
                            }
                        else
                            {
                            Console.WriteLine("given number is not prime number");
                            }
                        break;
                    }
            }

            


        }
    }
}
