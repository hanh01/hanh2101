using System;

namespace Snippet8
{
    class General<T,U>
    {
        T _valOne;
        U _valTwo;
        public void AcceptValues(T item)
        {
            _valOne = item;
        }
        public void AcceptValues(U item)
        {
            _valTwo = item;
        }
        public void Display()
        {
            Console.Write(_valOne + "\t" + _valTwo);
        }
    }
    class MethodOverload
    {
        static void Main(string[] args)
        {
            General<int, string> objGenOne = new General<int, string>();
            objGenOne.AcceptValues(10);
            objGenOne.AcceptValues("Smith");
            Console.WriteLine("ID\tName\tDesignation\tSalaty");
            objGenOne.Display();
            General<string, float> objGenTwo = new General<string, float>();
            objGenTwo.AcceptValues("Mechanic");
            objGenTwo.AcceptValues(2500);
            Console.Write("\t");
            objGenTwo.Display();
            Console.WriteLine();

        }
    }
}
