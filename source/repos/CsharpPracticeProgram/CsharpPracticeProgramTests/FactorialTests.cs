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
    public class FactorialTests
    {
        [TestMethod()]
        [ExpectedException(typeof(ArithmeticException))]
        [System.Diagnostics.CodeAnalysis.ExcludeFromCodeCoverage]
        public void findFactorialNumberTest()
        {
            try
            {
                Factorial factorial = new Factorial();
                Assert.AreEqual(120, factorial.findFactorialNumber(0));
            }
            catch(ArithmeticException e)
            {
                throw e;
            }
        }
    }
}
