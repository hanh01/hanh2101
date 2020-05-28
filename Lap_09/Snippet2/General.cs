using System;

namespace Snippet2
{
    class General<T>
    {
        T[] values;
        int _counter = 0;
        public General(int max)
        {
            values = new T[max];
        }
        public void Add(T val)
        {
            if (_counter < values.Length)
            {
                values[_counter] = val;
                _counter++;
            }
        }
        public void Display()
        {
            Console.WriteLine("Contructed Class is of type: " + typeof(T));
            Console.WriteLine("Values stored in the object of contructed class are:");
            for(int i = 0; i< values.Length; i++)
            {
                Console.WriteLine(values[i]);
            }
        }
    }
}
