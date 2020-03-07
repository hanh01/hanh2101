/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JP_08;

/**
 *
 * @author Admin
 */
public class testPersonStudentStaff{
    public static void main(String [] args){
        Person p = new Person("hanh","hanh.com");
        System.out.println(p.toString());
        System.out.println("Address : " + p.getAddress());
        
         System.out.println("------------------------------ ");
        Student st = new Student("hanh","hanh.com","APTECH",2019,1000);
        System.out.println(st);
        System.out.println("Fee :" + st.getFee());
        System.out.println("Program :" + st.getProgram());
        System.out.println("Year :" + st.getYear());
       
         System.out.println("------------------------------ ");
         Staff s = new Staff("hanh","hanh.com","FPT",1000);
         System.out.println(s);
         s.setPay(2000);
         s.setSchool("ABC");
         System.out.println("School :" + s.getSchool());
         System.out.println("Pay :" + s.getPay());
         
    }
}
