using System;

namespace Snippet13
{
    class Circle
    {
        protected const double PI = 3.14;
        protected double Radius = 14.9;
        public virtual double Area()
        {
            return PI * Radius * Radius;
        }
    }
}
