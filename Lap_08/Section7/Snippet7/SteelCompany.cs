using System;
using System.Collections.Generic;
using System.Text;

namespace Snippet7
{
    class SteelCompany : Metals
    {
        string _grade;
        public SteelCompany(string grade) : base("Steel")
        {
            _grade = grade;
            Console.WriteLine("Grade: " + _grade);
        }
    }
}
