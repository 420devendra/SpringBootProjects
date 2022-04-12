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
    public class TwoSumTests
    {
        [TestMethod()]
        [ExpectedException(typeof(ArithmeticException))]
        public void twoSumProblemTest()
        {
            TwoSum twoSum = new TwoSum();
            int[] arr = { 10, 5, 4, 6, 7, 8, 1, 12 };
            Assert.IsTrue(twoSum.twoSumProblem(arr,0));
        }
    }
}