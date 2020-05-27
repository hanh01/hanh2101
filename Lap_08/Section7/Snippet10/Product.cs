using System;

namespace Snippet10
{
    class Product
    {
        public int Quantity;
        public int Cost;
    }
    class Goods
    {
        static void Main(string[] args)
        {
            Product objProduct = new Product();
            objProduct.Quantity = 50;
            objProduct.Cost = 75;
            Console.WriteLine("Quantity of the Product : " + objProduct.Quantity);
            Console.WriteLine("Cost of the Product : " + objProduct.Cost);
        }
    }
    class Pen: Product { }
}
