using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CsharpPracticeProgram
{
    public class CheckPrimeNumber 
    {
        public Boolean checkPrimeNumber(int number)
        {
            int flag = 0;
            for(int i=2; i<=number; i++)
            {
                if (number % i == 0)
                {
                    flag += 1;
                }
             
            }
            return flag == 1;
        }
    }
}
