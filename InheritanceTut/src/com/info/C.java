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
public class C extends B {
    public static void main(String[] args){
        A a= new A();
        B b = new B();
        C c = new C();
        
        a.abc();
        b.xyz();
        b.abc();
        c.abc();
        c.xyz();
  //      a.xyz();  // because xyz() is method of child class. parent cant inherit of child
    }
    
}
