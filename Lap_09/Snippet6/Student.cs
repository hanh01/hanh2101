using System;

namespace Snippet6
{
    interface IDetails
    {
        void GetDetails();
    }
    class Student : IDetails
    {
        string _studName;
        int _studID;
        public Student(string name, int num)
        {
            _studName = name;
            _studID = num;
        }
        public void GetDetails()
        {
            Console.WriteLine(_studID + "\t" + _studName);
        }
    }
}
