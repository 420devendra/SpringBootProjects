using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CsharpPracticeProgram
{
    public class TwoSum
    {
        public bool twoSumProblem(int[] arr, int target)
        {
            try
            {
                if (target == 0)
                {
                    throw new ArithmeticException("don't give target number as Zero!");
                }
                else if(target < 0)
                {
                    throw new ArithmeticException("Please Enter Postive Number!");
                }


                int i, result = 0;
                bool flag = false;
                for (i = 0; i < arr.Length; i++)
                {
                    for (int j = i + 1; j < arr.Length; j++)
                    {
                        result = arr[i] + arr[j];
                        if (result == target)
                        {
                            flag = true;
                            break;
                        }

                    }


                }
                return flag;
                
        }
            catch (ArithmeticException e)
            {
                throw e;
            }
    }
       
    }
}