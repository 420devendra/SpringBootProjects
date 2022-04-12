using Microsoft.VisualStudio.TestTools.UnitTesting;
using CsharpPracticeProgram;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CsharpPracticeProgram.Tests
{
    [TestClass()]
    public class AnagramTests
    {
        [TestMethod()]
        public void checkAnagramStringTest()

        {
            Anagram checkAnagram = new Anagram();

            Assert.IsTrue(checkAnagram.checkAnagramString("ram","mar"));
        }
    }
}