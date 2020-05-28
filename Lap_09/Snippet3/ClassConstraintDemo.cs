using System;
using System.Collections.Generic;
using System.Text;

namespace Snippet3
{
    class ClassConstraintDemo
    {
        static void Main(string[] args)
        {
            GenericList<Employee> objList = new GenericList<Employee>();
            objList.Add(new Employee("John", 100));
            objList.Add(new Employee("James", 200));
            objList.Add(new Employee("Patrich", 300));
            objList.Display();
        }
    }
}
