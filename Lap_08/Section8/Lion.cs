using System;
using System.Collections.Generic;
using System.Text;

namespace Snippet2
{
    class Lion : Animal
    {
        public override void AnimalSound()
        {
            Console.WriteLine("Lion roars");
        }
        static void Main(string[] args)
        {
            Lion objLion = new Lion();
            objLion.AnimalSound();
            objLion.Eat();
        }
    }
}
