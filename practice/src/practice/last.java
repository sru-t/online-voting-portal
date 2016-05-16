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
public class last {
    public static String name;
    public String address;
    
    public void abc(){System.out.println("this is not static");
        name="rr";
        address="bb";
    }
    public static void xyz(){
        System.out.println("this is static");
        name="rai";
        
    }
    public static void main(String[] abc){
        name="kk";    
    }
    
}
