using System;

namespace MethodOverloadExample
{
    class MethodOverloadExample
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Square of integer value " + Square(5)) ;
            Console.WriteLine("Square of fload value " + Square(2.5F));
        }
        static int Square(int num)
        {
            return num * num;
        }
        static float Square(float num)
        {
            return num * num;
        }
    }
}
