using System;

namespace Medicine
{
    class Product
    {
        static int _productId;
        static double _price;
        static Product()
        {
            _productId = 10;
            _price = 156.32;
        }

        public static void Display()
        {
            Console.WriteLine("Product ID:" + _productId);
            Console.WriteLine("Product price:" + _price);
        }
    }
    class Medicine
    {
        static void Main(string[] args)
        {
            Product.Display();
        }
    }
}
