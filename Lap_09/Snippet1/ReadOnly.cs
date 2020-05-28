using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;

namespace Snippet1
{
    class ReadOnly
    {
        static void Main(string[] args)
        {
            List<string> objList = new List<string>();
            objList.Add("Francis");
            objList.Add("James");
            objList.Add("Baptista");
            objList.Add("Micheal");
            ReadOnlyCollection<string> objReadOnly = new ReadOnlyCollection<string>(objList);
            Console.WriteLine("Values stored in the read only collection");
            foreach(string str in objReadOnly)
            {
                Console.WriteLine(str);
            }
            Console.WriteLine();
            Console.WriteLine("Total number of elements in the read only collection:" + objReadOnly.Count);
            if (objList.Contains("Francis"))
            {
                objList.Insert(2, "Peter");
            }
            Console.WriteLine("\n Values stored in the list after modification");
            foreach(string str in objReadOnly)
            {
                Console.WriteLine(str);
            }
            string[] array = new string[objReadOnly.Count * 2];
            objReadOnly.CopyTo(array, 5);
            Console.WriteLine("\n Total number of values that can be stored in the new array:" + array.Length);
            Console.WriteLine("Values in the new array");
            foreach(string str in array)
            {
                if(str == null)
                {
                    Console.WriteLine("null");
                }
                else
                {
                    Console.WriteLine(str);
                }
            }
        }
    }
}
