/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info;

/**
 *
 * @author Lenovo G40
 */
public class Student {
    public String name;
    public String address;
    
    public  Student(){
        System.out.println("This is default constructor");
     //   this.name = "Abc";
    }
    public Student(String name){
        System.out.println("1----->>>>");
        this.name = name;
    }
    public Student(String name, String address){
        System.out.println("2----->>>>");
        this.name = name;
        this.address = address;
    }
    
    public static void main(String[] args){
        
        Student s1 = new Student();
        Student s2 = new Student("RAm");
        Student s3 = new Student("Hari", "Ktm");
        
         System.out.println(s1.name+"---"+s1.address);
         System.out.println(s2.name +"---"+ s2.address);
         System.out.println(s3.name +"---" +s3.address);
    }
}
