using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Text;

namespace Demo
{
    class Student1
    {
        string name = "Do Hong Hanh";
        int age = 19;

        public void Display()
        {
            Console.WriteLine("Ten cua ban la :" + name);
            Console.WriteLine("Tuoi cua ban la :" + age);
        }

        public static void Main(String[] arg)
        {
            Student1 student = new Student1();
            student.Display();
        }

    }
}
