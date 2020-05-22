using System;

namespace ExHandling3
{
    class MainClass
    {
        public static int AnExceptionFunction(int value)
        {
            if (value == 0)
                throw new DivideByZeroException("Divide By ) error!");
            int x = 20 / value;
            return x;
        }
        static void Main()
        {
            int value = 0;
            try
            {
                value = AnExceptionFunction(10);
                Console.WriteLine("Value = {0}", value);
                AnExceptionFunction(0);
                Console.WriteLine("Value = {0}", value);
            }
            catch(Exception e)
            {
                Console.WriteLine("caught an exception {0}. Continuing", e);

            }
            Console.WriteLine("Done");  
        }
    }
}
