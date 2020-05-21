using System;
using System.Collections.Generic;
using System.Text;

namespace GeometricObject
{
    public class Circle: GeometricObject
    {
        private double radius;
        public Circle(double x)
        {
            this.radius = x;
        }

        public Circle(double x, string c, double w) : base(c, w)
        {
            this.radius = x;
        }

        public override string ToString()
        {
            return "Circle has: radius is " + radius + ", color is " + PColor + ",weight is " + PWeight;
        }

        public override double findArea()
        {
            return Math.PI * radius * radius;
        }

        public override double findPerimeter()
        {
            return 2 * Math.PI * radius;
        }

    }
    
    
}
