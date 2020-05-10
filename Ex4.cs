using System;

namespace Ex4
{
    class Ex4
    {
        static void Main(string[] args)
        {
            Console.Write("Nhap vao so nguyen : ");
            int a = int.Parse(Console.ReadLine());

            for(int i = 0; i<9; i++)
            {
                Console.WriteLine("Boi so cua a la : " + (a * i));
            }
        }
    }
}
