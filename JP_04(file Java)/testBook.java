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
public class testBook {
    public static void main(String [] args){
        Author codeLean = new Author("Code Lean", "codeleanvn@gmail.com", 'f');
        System.out.println(codeLean);
        
        
        Book dummyBook = new Book("Java for dummy",codeLean,19.95,99);
        System.out.println(dummyBook);
        
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println(dummyBook.getName());
        System.out.println(dummyBook.getPrice());
        System.out.println(dummyBook.getAuthor());
        System.out.println(dummyBook.getAuthor().getEmail()); 
        
        Book anotherBook = new Book("move Java", new Author("Hanh","hanh@gmail.com",'f'),29.9);
        System.out.println(anotherBook);
        
       
    }
}
