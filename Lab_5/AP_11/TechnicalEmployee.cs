using System;
using System.Collections.Generic;
using System.Text;

namespace AP_11
{
    class TechnicalEmployee : Employee
    {
        public int successfulCheckIns = 5;

        public TechnicalEmployee(String name) : base(name, 75000)
        {

        }

        public override String employeeStatus()
        {
            return this.toString() + "has" + this.successfulCheckIns + "successful check ins";
        }
    }
}
