using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CsharpPracticeProgram
{
    public class SumNumber
    {
        int sum = 0;
        public int sumOfNumbers(int number)
        {
            for (int i = 1; i <= number; i++)
            {
                sum = sum + i;
            }
            return sum;
        }
    }
}
