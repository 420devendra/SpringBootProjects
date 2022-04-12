using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CsharpPracticeProgram
{
    public class Factorial
    {
        public int findFactorialNumber(int number)
        {
            try
            {
                if(number == 0){
                    throw new ArithmeticException("can't pass zero");
                }
                int i, fact = 1;
                for (i = 1; i <= number; i++)
                {
                    fact = fact * i;
                }
                
                return fact;

            }
            catch(ArithmeticException e)
            {
                throw e;
            }

        }

    }
}
