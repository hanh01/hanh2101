using System;

namespace Snippet9
{
    class Student
    {
        string _studentName = "James";
        string _address = "California";
        public virtual void PrintDetails()
        {
            Console.WriteLine("Student Name:" + _studentName);
            Console.WriteLine("Address: " + _address);
        }
    }
}
