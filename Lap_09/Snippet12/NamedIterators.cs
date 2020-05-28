using System;
using System.Collections;

namespace Snippet12
{
    class NamedIterators
    { 
        string[] cars = { "Mercedes", "BMW", "Toyota", "Nissan"};
        public IEnumerable GetCarNames()
        {
            for (int i = 0; i < cars.Length; i++)
            {
                yield return cars[i];
            }
        }
        static void Main(string[] args)
        {
            NamedIterators objIterator = new NamedIterators();
            foreach (string str in objIterator.GetCarNames())
            {
                Console.WriteLine(str);
            }
        }
    }
}
