using System;
using System.Collections.Generic;
using System.Text;

namespace Animal2
{
    class Dog : Animal2
    {
            public void Eat()
            {
            }
        public void Main(string[] args)
        {
            Dog objDog = new Dog();
            objDog.Eat();
            base.Eat();
        }
    }
}
