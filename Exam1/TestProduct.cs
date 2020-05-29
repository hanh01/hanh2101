using System;
using System.Collections.Generic;
using System.Text;

namespace Exam
{
    class TestProduct
    {
        public static void Main(string[] args)
        {
            Product[] array = new Product[6];
            array[0] = new Book(1, "C#1",10, "Hanh1");
            array[1] = new Book(2, "C#1", 11, "Hanh2");
            array[2] = new Book(3, "C#1", 12, "Hanh3");
            array[3] = new MobilePhone(4, "C#1", 13, "Hanh1");
            array[4] = new MobilePhone(5, "C#1", 14, "Hanh1");
            array[5] = new MobilePhone(6, "C#1", 15, "Hanh1");

            double taxBook = 0;
            for (int i = 0; i <= 2; i++)
            {
                taxBook += array[i].computeTax();
            }

     
            double taxMobilePhone = 0;
            for (int i = 3; i <= 5; i++)
            {
                taxMobilePhone += array[i].computeTax();
            }

            double computeTotaltax = 0;
            for (int i = 0; i < array.Length; i++)
            {
                computeTotaltax += array[i].computeTax();
            }

            Console.WriteLine("Total tax of Book: " + taxBook);
            Console.WriteLine("Total tax of MobilePhone: " + taxMobilePhone);
            Console.WriteLine("Total tax : " + computeTotaltax);

        }
    }
}
