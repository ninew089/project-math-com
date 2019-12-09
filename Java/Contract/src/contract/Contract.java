/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contract;

/**
 *
 * @author apple
 */
public class Contract {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Name name=new Name("Jitta","","Jnk");
        Date date=new Date(1,01,1999);
        Person p1=new Person(name,date,"0990965701");
        System.out.println(p1.getDetail());
        p1.setName("Mon", "lo", "Ja");
        System.out.println(p1.getDetail());
    }
    
}
