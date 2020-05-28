using System;
using System.Collections.Generic;
using System.Text;

namespace Snippet2
{
    class Student
    {
        static void Main(string[] args)
        {
            General<string> objGeneral = new General<string>(3);
            objGeneral.Add("John");
            objGeneral.Add("Patrick");
            objGeneral.Display();
            General<int> objGeneral2 = new General<int>(2);
            objGeneral2.Add(200);
            objGeneral2.Add(35);
            objGeneral2.Display();
        }
    }
}
