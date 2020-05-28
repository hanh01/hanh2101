using System;

namespace Snippet3
{
    class Employee
    {
        string _empName;
        int _empID;
        public Employee(string name, int num)
        {
            _empName = name;
            _empID = num;
        }
        public string Name
        {
            get
            {
                return _empName;
            }
        }
        public int ID
        {
            get 
            {
                return _empID;    
             }
        }
    }
}
