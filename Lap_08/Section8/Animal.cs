using System;

namespace Snippet2
{
    abstract class Animal
    {
       
       public void Eat()
        {
            Console.WriteLine("Every animal eats food in order to survive");
        }
        public abstract void AnimalSound();
    }
   
}
