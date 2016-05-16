/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info;

/**
 *
 * @author windows10
 */
public class B extends A {
    public void abc(){
        System.out.println("B---->>>>>");
       
    } 
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        
        a.abc();
        b.abc();
    }
}
