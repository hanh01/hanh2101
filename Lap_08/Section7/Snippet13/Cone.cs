using System;
using System.Collections.Generic;
using System.Text;

namespace Snippet13
{
    class Cone : Circle
    {
        protected double Side = 10.2;
        public override double Area()
        {
            return PI * Radius * Side;
        }
        static void Main(string[] args)
        {
            Circle objRunOne = new Circle();
            Console.WriteLine("Area is : " + objRunOne.Area());
            Circle objRunTwo = new Cone();
            Console.WriteLine("Area is : " + objRunTwo.Area());
        }
    }
    
}
