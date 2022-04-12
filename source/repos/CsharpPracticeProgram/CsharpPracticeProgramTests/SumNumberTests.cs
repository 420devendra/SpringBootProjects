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
    public class SumNumberTests
    {
        [TestMethod()]
        public void sumOfNumbersTest()
        {
            SumNumber sumNuber = new SumNumber();
            Assert.AreEqual(55, sumNuber.sumOfNumbers(10));
        }
    }
}