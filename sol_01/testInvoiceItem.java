/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sol_01;

/**
 *
 * @author Admin
 */
public class testInvoiceItem {
    public static void main(String [] args){
        InvoiceItem i1 = new InvoiceItem();
        System.out.println(i1.toString());
        System.out.println("qty :" + i1.getQty());
        System.out.println("unitprice : " + i1.getUnitPrice());
        System.out.println("Total : " + i1.getTotal());
        
        System.out.println("-------------------");
        i1.setQty(4);
        i1.setUnitPrice(4.500);
        System.out.println("qty :" + i1.getQty());
        System.out.println("unitprice : " + i1.getUnitPrice());
        System.out.println("Total : " + i1.getTotal());
    }
}
