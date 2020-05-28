using System;
using System.Collections.Generic;

namespace Snippet11
{
    class GenericDepartment<T>
    {
        T[] item;
        public GenericDepartment(T[] val)
        {
            item = val;
        }
        public IEnumerator<T> GetEnumerator()
        {
            foreach (T value in item)
            {
                yield return value;
            }
        }
    }
    class GenericIterator
    {
        static void Main(string[] args)
        {
            string[] departmentNames = { "Marketing", "Finance", "Information Technology", "Human Resources" };
            GenericDepartment<string> objGeneralName = new GenericDepartment<string>(departmentNames);
            foreach (string val in objGeneralName)
            {
                Console.Write(val + "\t");
            }
            int[] departmentID = { 101, 110, 210, 220 };
            GenericDepartment<int> objGeneralID = new GenericDepartment<int>(departmentID);
            Console.WriteLine();
            foreach (int val in objGeneralID)
            {
                Console.Write(val + "\t\t");
            }
            Console.WriteLine();
        }
    }
}
