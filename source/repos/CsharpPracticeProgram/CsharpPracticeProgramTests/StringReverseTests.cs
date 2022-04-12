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
    public class StringReverseTests
    {
        [TestMethod()]
        public void reverseStringTest()
        {
            StringReverse stringReverse = new StringReverse();
            Assert.AreEqual("uved", stringReverse.reverseString("devu"));
        }
    }
}