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
public class testBook2 {
    public static void main(String [] args){
        Author[] authors = new Author[2];
        authors[0] = new Author("A","A2101@gmail.com",'m');
        authors[1] = new Author("B","B210101@gmail.com", 'm');
        
        Book2 javaDummy = new Book2("Java for Dummy", authors, 19.99,99);
        System.out.println(javaDummy);
    }
}
