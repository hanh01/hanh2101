using System;
using System.Collections.Generic;
using System.Text;

namespace AP_11
{
    class BusinessEmployee : Employee
    {
        public double bonusBudget = 1000;
        public BusinessEmployee(String name) : base(name, 50000)
        {

        }
        public override String employeeStatus()
        {
            return ToString() + "with a budget of" + this.bonusBudget;
        }
    }
}
