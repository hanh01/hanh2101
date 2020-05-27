using System;

namespace Snippet8
{
    class Animal
    {
        public virtual void Eat()
        {
            Console.WriteLine("Every animal eats something");
        }
        protected void DoSomethimg()
        {
            Console.WriteLine("Every animal does something");
        }
    }
}
