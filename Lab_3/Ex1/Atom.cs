using System;
using System.Collections.Generic;
using System.Text;

namespace Ex1
{
    class Atom
    {
        public int atomicnumber;
        public string symbol;
        public string fullnamne;
        public double atomicweight;
        public Atom atom;

        public Atom()
        {
        }

        public Atom(int atomicnumber, string symbol, string fullnamne, double atomicweight)
        {
            this.atomicnumber = atomicnumber;
            this.symbol = symbol;
            this.fullnamne = fullnamne;
            this.atomicweight = atomicweight;
        }

        public Boolean accepts()
        {
            Console.WriteLine("Atomic information");
            Console.WriteLine("==================");
            do
            {
                Console.Write("Enter atomic number:");
                atomicnumber = Convert.ToInt32(Console.ReadLine());
                if (atomicnumber != 0)
                {
                    Console.Write("Enter symbol:");
                    symbol = Convert.ToString(Console.ReadLine());
                    Console.Write("Enter full name:");
                    fullnamne = Convert.ToString(Console.ReadLine());
                    Console.Write("Enter atomic weight:");
                    atomicweight = Convert.ToDouble(Console.ReadLine());
                    Atom atom = new Atom(atomicnumber, symbol, fullnamne, atomicweight);
                }
                else
                {
                    atom.display(atom);
                    Console.ReadLine();

                }
            } while (atomicnumber != 0);
            return false;
        }

        public void display(Atom atom)
        {
            Console.WriteLine("No   Sym   Name   Weight:");
            Console.WriteLine("-------------------------------------------------------");
            Console.WriteLine(atom.atomicnumber + "    " + atom.symbol + "    " + atom.fullnamne + "    " + atom.atomicweight);

        }
    }
}
