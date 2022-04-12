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
    public class CheckPrimeNumberTests
    {
        [TestMethod()]
        public void checkPrimeNumberTest()
        {
            CheckPrimeNumber checkPNumber = new CheckPrimeNumber();
            Assert.IsTrue(checkPNumber.checkPrimeNumber(5));
        }
    }
}