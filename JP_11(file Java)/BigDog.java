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
public class BigDog extends Dog {
    @Override
    public void greeting(){
        System.out.println("Woow!");
    }
    
    @Override
    public void greeting(Dog another){
        System.out.println("Wooooooooow!");
    }
}
