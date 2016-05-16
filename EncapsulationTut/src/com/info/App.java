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
public class App {
    
    public static void main(String[] args){
        
        Student s1 = new Student();
        s1.name = "RAm";
        
//        s1.address = "Ktm";
        s1.setAddress("Ktm");
        System.out.println(s1.name);
        System.out.println(s1.getAddress());
        
    }
        
    
}
