using System;
using System.Collections.Generic;
using System.Text;

namespace Employees
{
    class Department : Employees
    {
        int _deptld = 501;
        string _depName = "Sales";
        new void Display()
        {
            base.Display();
            Console.WriteLine("DepartmentID : " + _deptld);
            Console.WriteLine("DepartmentName : " + _depName);
        }

        static void Main(string [] args)
        {
            Department objDepartment = new Department();
            objDepartment.Display();

        }
    }
}
