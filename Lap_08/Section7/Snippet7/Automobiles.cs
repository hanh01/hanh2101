using System;
using System.Collections.Generic;
using System.Text;

namespace Snippet7
{
    class Automobiles : SteelCompany
    {
        string _part;
        public Automobiles(string part) : base("Cast Iron")
        {
            _part = part;
            Console.WriteLine("Part: \t\t" + _part);
        }
        static void Main(string[] args)
        {
            Automobiles objAutomobiles = new Automobiles("Chassies");
        }
    }
}
