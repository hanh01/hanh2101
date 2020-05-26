using System;

namespace StaticMethods
{
    class Calculate
    {
        public static void Addition (int va11, int va12)
        {
            Console.WriteLine(va11 + va12);
        }
        public void Multiply(int va11, int va12)
        {
            Console.WriteLine(va11 * va12);
        }
    }
    class StaticMethods
    {
        static void Main(string[] args)
        {
            Calculate.Addition(10, 50);
            Calculate objCal = new Calculate();
            objCal.Multiply(10, 20);
        }
    }
}
