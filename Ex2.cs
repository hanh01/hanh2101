using System;
using System.Net.Http.Headers;

namespace Ex2
{
    class Ex2
    {
        static void Main(string[] args)
        {
            Console.Write("Nhap vao so thu 1 : ");
            int a = int.Parse(Console.ReadLine());

            Console.Write("Nhap vao so thu 2 : ");
            int b = int.Parse(Console.ReadLine());

            Console.Write("Nhap vao so thu 3 : ");
            int c = int.Parse(Console.ReadLine());

            int max = a;

            if(a < b)
            {
                max = b;
            }

            if(a < c)
            {
                max = c;
            }

            Console.WriteLine("Trong 3 so a,b,c thi so max la : " + max);
        }
    }
}
