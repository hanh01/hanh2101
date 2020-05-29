using System;
using System.Collections.Generic;
using System.Text;

namespace Exam
{
    class Book : Product
    {
        public Book(int id, string name, double price, string producer) : base(id, name, price ,producer) { }
      
        public Book() { }
        public override double computeTax()
        {
            return getPrice() * 0.08;
        }

    }
}
