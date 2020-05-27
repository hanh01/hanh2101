using System;
using System.Collections.Generic;
using System.Text;

namespace Snippet_6
{
    class Canine : Animal
    {
        public Canine() : base("Lion")
        {
            Console.WriteLine("Derived Canine");
        }
    }
}
