using System;

namespace Ex5
{
    class Ex5
    {
        static void Main(string[] args)
        {

            double j= 1;

            for(int i = 1; i <= 21; i++)
            {
                j = j * i;
                Console.WriteLine("{0}! = {1}", i, j);
            }
        }
    }
}
