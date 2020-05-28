using System;

namespace Snippet4
{
    class SwapNumbers
    {
        static void Swap<T>(ref T valOne, ref T valTwo)
        {
            T temp = valOne;
            valOne = valTwo;
            valTwo = temp;
        }
        static void Main(string[] args)
        {
            int numOne = 23;
            int numTwo = 45;
            Console.WriteLine("Value before swappint:" + numOne + "&" + numTwo);
            Swap<int>(ref numOne, ref numTwo);
            Console.WriteLine("Values after swapping :" + numOne + "&" + numTwo);
        }
    }
}
