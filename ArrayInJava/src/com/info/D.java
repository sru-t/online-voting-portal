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
public class D {
    int a=5;
    int b=5;
    Integer x= new Integer(6);
    Integer y= new Integer(6);
    public static void main(String[] args){
        D d=new D();
        System.out.println(d.x);
        System.out.println(d.y);
        System.out.println(d.b);
        System.out.println(d.a);
        System.out.println(d.b==d.a); //true
        System.out.println(d.x==d.y);//false
        System.out.println(d.x.equals(d.y));
    
    }
    
}
