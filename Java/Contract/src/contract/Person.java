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
public class Person {
    private Name name;
    private Date hbd;
    private String  tel;
    Person(Name name,Date hbd,String tel){
        this.name=name;
        this.hbd=hbd;
        this.tel=tel;
    }
    void setName(String f,String m,String l){
        name.setFirts(f);
        name.setMiddle(m);
        name.setLast(l);
    }
    void setTel(String tel){
        this.tel=tel; 
    }
    public String getDetail(){
        String str="";
        str+="Name:"+name.getName()+"\n";
        str+="HBD:"+hbd.toString()+"\n";
        str+="Tel:"+tel;
                return str;
    }
}
