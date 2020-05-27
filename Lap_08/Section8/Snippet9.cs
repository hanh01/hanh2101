using System;

namespace Snippet9
{
    interface IMath
    {
        void Area();
    }
    class Circle : IMath
    {
        public const float PI = 3.14F;
        protected float Radius;
        protected double AreaOfCircle;
        public virtual void Area()
        {
            AreaOfCircle = (PI * Radius * Radius);
        }
    }
    class Sphere : Circle
    {
        double _areaOfSphere;
        public override void Area()
        {
            base.Area();
            _areaOfSphere = (AreaOfCircle * 4);
        }
        static void Main(string[] args)
        {
            Sphere objSphere = new Sphere();
            objSphere.Radius = 7;
            objSphere.Area();
            Console.WriteLine("Area of Sphere: {0:F2}",
                objSphere._areaOfSphere);
        }
    } 
}
