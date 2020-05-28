using System;
using System.Collections;

namespace Snippet10
{
    class Department : IEnumerable
    {
        string[] departmentNames = { "MArketing", "Finance", "Information Technology", "Human Resources" };
        public IEnumerator GetEnumerator()
        {
            for( int i=0; i< departmentNames.Length; i++)
            {
                yield return departmentNames[i];
            }
        }
        static void Main(string[] args)
        {
            Department objDepartment = new Department();
            Console.WriteLine("DepartmentNames");
            Console.WriteLine();
            foreach(string str in objDepartment)
            {
                Console.WriteLine(str);
            }
        }
    }
   
    
}
