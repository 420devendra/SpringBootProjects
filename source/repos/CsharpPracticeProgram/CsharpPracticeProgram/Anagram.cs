using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CsharpPracticeProgram
{
    public class Anagram
    {
        public bool checkAnagramString(string firstName, string secondName)
        {
            if (firstName.Length != secondName.Length)
            {
                return false;
            }
            char[] firstCharsArray = firstName.ToLower().ToCharArray();
            char[] secondCharsArray = secondName.ToLower().ToCharArray();
            Array.Sort(firstCharsArray);
            Array.Sort(secondCharsArray);
            for (int i = 0; i < firstCharsArray.Length; i++)
            {
                if (firstCharsArray[i].ToString() != secondCharsArray[i].ToString())
                {
                    return false;
                }
            }
            return true;
        }
    }
}

