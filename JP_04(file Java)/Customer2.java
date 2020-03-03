/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_04;

/**
 *
 * @author Admin
 */
public class Customer2 {
    private int ID;
    private String name;
    private char gender;
    
    public Customer2(int ID, String name,char gender){
        this.ID = ID;
        this.name = name;
        this.gender = gender;
    }
    public int getID(){
        return this.ID;
    }
    public String getName(){
        return this.name;
    }
    public char getGender(){
        return this.gender;
    }

    @Override
    public String toString() {
      return  name + "(" + ID + ')';
    }
    
    
}
