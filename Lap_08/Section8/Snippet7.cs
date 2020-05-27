using System;

namespace Snippet7
{
    interface ITerrestrialAnimal
    {
        string Eat();
    }
    interface IMarineAnimal
    {
        string Eat();
    }
    class Crocodile : ITerrestrialAnimal, IMarineAnimal
    {
        string ITerrestrialAnimal.Eat()
        {
            string terCroc = "Crocodile eats other animals";
            return terCroc;
        }
        string IMarineAnimal.Eat()
        {
            string marCroc = "Crocodile eats fish and marine animals";
            return marCroc;
        }
        public string EatTerrestrial()
        {
            ITerrestrialAnimal objTerAnimal;
            objTerAnimal = this;
            return objTerAnimal.Eat();
        }
        public string EatMarine()
        {
            IMarineAnimal objMarAnimal;
            objMarAnimal = this;
            return objMarAnimal.Eat();
        }
        public static void Main(string[] args)
        {
            Crocodile objCrocodile = new Crocodile();
            string terCroc = objCrocodile.EatTerrestrial();
            Console.WriteLine(terCroc);
            string marCroc = objCrocodile.EatMarine();
            Console.WriteLine(marCroc);
        }
    }
}
