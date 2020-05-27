using System;
using System.Collections.Generic;
using System.Text;

namespace Snippet8
{
    class Cat : Animal
    {
        public override void Eat()
        {
            Console.WriteLine("Cat loves to eat the mouse");
        }
        static void Main (string [] args)
        {
            Cat objCat = new Cat();
            objCat.Eat();
        }
    }
}
