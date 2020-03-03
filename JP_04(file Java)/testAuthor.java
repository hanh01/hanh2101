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
public class testAuthor {
    public static void main(String [] args){
        Author a1 = new Author("Code Lean","codeleanvn@gmail.com",'m');
        System.out.println(a1);
        a1.setEmail("codelean@gmail.com");
        System.out.println("Name :" + a1.getName());
        System.out.println("Email :" + a1.getEmail());
        System.out.println("Gender :" + a1.getGender());
        
        
        Author a2 = new Author("Code","codevn@gmail.com",'m');
        System.out.println(a2);
    }
        
}
