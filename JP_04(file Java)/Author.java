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
public class Author {
    private String name;
    private String email;
    private char gender;
    
    public Author(String name, String email, char gender){
        this.email = email;
        this.name = name;
        this.gender = gender;
    }
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getGender(){
        return this.gender;
    }

    @Override
    public String toString() {
        return "Author["  + name + "," + email + "," + gender + ']';
    }
    
    

}
