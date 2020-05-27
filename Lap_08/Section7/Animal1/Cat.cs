using System;
using System.Collections.Generic;
using System.Text;

namespace Animal1
{
    class Cat : Animal1
    {
        static void Main(String [] args)
        {
            Cat objCat = new Cat();
            objCat.Food = "Mouse";
            objCat.Activity = "lazearound";
            Console.WriteLine("The Cat loves to eat " + objCat.Food + ".");
            Console.WriteLine("The Cat loves to " + objCat.Activity + ".");

        }
    }
}
