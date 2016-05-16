/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.info;

/**
 *
 * @author Lenovo G40
 */
public class Student {
    public String name;
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
        s1.name="ram";
        s2.name="hari";
        System.out.println(s1.name);
        s1=s2;
        System.out.println(s1.name);
        s1.name="shyam";
        System.out.print(s2.name);
        System.out.print("5");
        
    }
}
