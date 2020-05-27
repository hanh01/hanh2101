using System;

namespace Snippet7
{
    class Metals
    {
        string _metalType;
        public Metals(string type)
        {
            _metalType = type;
            Console.WriteLine("Metal:" + _metalType);
        }
    }
}
