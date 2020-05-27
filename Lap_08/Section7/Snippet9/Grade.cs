using System;
using System.Collections.Generic;
using System.Text;

namespace Snippet9
{
    class Grade : Student
    {
        string _class = "Four";
        float _percent = 71.25F;
        public override void PrintDetails()
        {
            Console.WriteLine("Class: " + _class);
            Console.WriteLine("Percentage: " + _percent);
        }
        static void Main(string[] args)
        {
            Student objStudent = new Student();
            Grade objGrade = new Grade();
            objStudent.PrintDetails();
            objGrade.PrintDetails();
        }
    }
}
