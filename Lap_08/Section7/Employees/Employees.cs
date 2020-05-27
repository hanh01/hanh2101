using System;
using System.Xml.Serialization;

namespace Employees
{
    class Employees
    {
        int _empId = 1;
        string _empName = "James Anderson";
        int _age = 25;

        public void Display()
        {
            Console.WriteLine("EmployeeID : " + _empId);
            Console.WriteLine("EmployeeName : " + _empName);
        }
    }
}
