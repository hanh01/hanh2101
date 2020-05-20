using System;
using System.Collections.Generic;
using System.Text;

namespace AP_11
{
    abstract class Employee
    {
        private static int employeeCount = 1;
        private string employeeName;
        private double employeeBaseSalary;
        private int employeeId;

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

        public Employee(String name,double baseSalary)
        {
            this.Name = name;
            this.BaseSalary = baseSalary;
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

        public abstract String employeeStatus();
    }
}
