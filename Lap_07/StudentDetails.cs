using System;

namespace Demo2
{
    class StudentDetails
    {
        string stuName;
        int rollNumber;

        public StudentDetails(string stuName, int rollNumber)
        {
            this.stuName = stuName;
            this.rollNumber = rollNumber;
        }

        public StudentDetails() { }

        public static void Main(string[] args)
        {
            StudentDetails student = new StudentDetails("hanh", 20);
            Console.WriteLine("Ten cua ban la : " + student.stuName);
            Console.WriteLine("Tuoi cua ban la : " + student.rollNumber);
        }
    }
}
