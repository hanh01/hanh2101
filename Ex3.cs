using System;

namespace Ex3
{
    class Ex3
    {
        static void Main(string[] args)
        {
            Console.Write("Moi ban nhap so tu 1 den 7 : ");
            int i = int.Parse(Console.ReadLine());

            if (i >= 1 && i < 7)
            {
                Console.WriteLine("Thu " + (i + 1));
            }
            
            if(i == 7)
            {
                Console.WriteLine("   Chu nhat");
            }

        }
    }
}
