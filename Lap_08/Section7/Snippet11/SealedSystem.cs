using System;

namespace Snippet11
{
    class ITSystem
    {
        public virtual void Print()
        {
            Console.WriteLine("The system should handed carefully");
        }
    }

    class CompanySystem : ITSystem
    {
        public sealed override void Print()
        {
            Console.WriteLine("The system information is confidential");
            Console.WriteLine("This information should not be overridden");
        }
    }
    class SealedSystem : CompanySystem
    {
        public  void Print()
        {
            Console.WriteLine("This is statement won't get executed");
        }

        static void Main(string[] args)
        {
            SealedSystem objSealed = new SealedSystem();
            objSealed.Print();
        }
    }
    
    
}
