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
        System.out.println("B---->>>>");
    }
    
    public void xyz(){
         System.out.println("x---->>>>");
    }
    
    public static void main(String[] args){
        A a1 = new A();
        A a2 = new B();
        B a3 = new B();
        
        long a=20;
        int b=20;
                a=b;
               // b=a;
                b=(int)a;
        a1=a2;
        a1=a3;
        a2=a1;
        a2=a3;
        a3=(B)a1;
        a3=(B)a2;
        
                
    }
}
