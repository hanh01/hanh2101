using System;
using System.Collections.Generic;
using System.Text;

namespace Snippet3
{
    class GenericList<T>where T : Employee
    {
        T[] _name = new T[3];
        int _counter = 0;
        public void Add(T val)
        {
            _name[_counter] = val;
            _counter++;
        }

        public void Display()
        {
            for(int i = 0; i< _counter; i++)
            {
                Console.WriteLine(_name[i].Name + "," + _name[i].ID);
            }
        }
    }
}
