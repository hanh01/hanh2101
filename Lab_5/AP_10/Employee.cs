using System;

namespace Lab_5
{
    class Employee
    {
        private string employeeName;
        private double employeeBaseSalary;
        private int employeeId;
        private static int employeeCount = 1;

        public string Name
        {
            get { return employeeName; }
            set { employeeName = value; }
        }
        public double BaseSalary
        {
            get { return employeeBaseSalary; }
            set { employeeBaseSalary = value; }
        }

        public int ID
        {
            get { return employeeId; }
            set { employeeId = value; }
        }

        public Employee(String name, double baseSalary)
        {
            this.Name = name;
            this.BaseSalary = BaseSalary;
            this.ID = employeeCount++;
        }

        public double getBaseSalary()
        {
            return this.BaseSalary;
        }

        public String getName()
        {
            return this.Name;
        }

        

        public int getEmployeeID()
        {
            return this.ID;
        }

        public String toString()
        {
            return this.ID + "" + this.Name;
        }

        public virtual String employeeStatus()
        {
            return toString() + "is in the company's system";
        }

    }
}
