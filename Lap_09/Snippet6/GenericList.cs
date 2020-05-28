using System;
using System.Collections.Generic;
using System.Text;

namespace Snippet6
{
    class GenericList<T>where T : IDetails
    {
        T[] _values = new T[3];
        int _counter = 0;
        public void Add(T val)
        {
            _values[_counter] = val;
            _counter++;
        }
        public void Display()
        {
            for(int i =0; i<3; i++)
            {
                _values[i].GetDetails();
            }
        }
    }
}
