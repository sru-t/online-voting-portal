/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practice;

/**
 *
 * @author Lenovo G40
 */
public class neww {
    public String name;
    public String address;
     
    public neww(){
        System.out.println("this is default constructor");
    
}
    public neww(String name,String address){
        this.name=name;
        this.address=address;
        System.out.println(name+"--"+address);
              
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        neww n1=new neww();
        neww n2=new neww("Ram","Sitapur");
        //n1.neww();
       // n2.neww();
      
        n1.name="hari";
        n1.address="ktm";
        System.out.println(n1.name+"-----"+n1.address);
      //  System.out.println(n2.name+"-----"+n2.address);
        
// TODO code application logic here
    }
    
}
