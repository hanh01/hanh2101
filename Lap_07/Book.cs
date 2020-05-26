using System;

namespace Book
{
    class Book
    {
        string bookName;
        double Price;
        public string Print()
        {
            return bookName + "," + Price;
        }

        public  void Input(string bkName,double price)
        {
           bookName = bkName;
            Price = price;
        }

        static void Main(string[] args)
        {
            Book book = new Book();
            book.Input("C#", 2500);
            Console.WriteLine(book.Print());
           
        }
    }
}
