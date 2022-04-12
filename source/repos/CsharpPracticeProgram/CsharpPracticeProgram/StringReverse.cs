using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CsharpPracticeProgram
{
    public class StringReverse
    {
        public string reverseString(string input)
        {
            char[] chararray = input.ToCharArray();
            int i=0, j=input.Length-1;
            while (i < j)
            {
                char temp;
                temp = chararray[i];
                chararray[i] = chararray[j];
                chararray[j] = temp;
                i++;
                j--;


            }
            return new string(chararray);
        }
    }
}
