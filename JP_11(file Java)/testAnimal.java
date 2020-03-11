/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_11;

/**
 *
 * @author Admin
 */
public class testAnimal {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.greeting();
        Dog dog1 = new Dog();
        dog1.greeting();
        BigDog b = new BigDog();
        b.greeting();
        
        Animal a1 = new Cat();
        a1.greeting();
        Animal a2 = new Dog();
        a2.greeting();
        Animal a3 = new BigDog();
        a3.greeting();
        
        Dog dog2 = (Dog)a2;
        BigDog b2 = (BigDog)a3;
        Dog dog3 = (Dog)a3;
        Cat cat2 = (Cat)a2;
        dog2.greeting(dog3);
        dog3.greeting(dog2);
        dog2.greeting(b2);
        b2.greeting(dog2);
        b2.greeting(b);
    }
}
