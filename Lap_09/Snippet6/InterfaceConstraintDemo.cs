using System;
using System.Collections.Generic;
using System.Text;

namespace Snippet6
{
    class InterfaceConstraintDemo
    {
        static void Main(string[] args)
        {
            GenericList<Student> objList = new GenericList<Student>();
            objList.Add(new Student("Wilson", 120));
            objList.Add(new Student("Jack", 1300));
            objList.Add(new Student("Peter", 140));
            objList.Display();
        }
    }
}
