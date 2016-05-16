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
public class E {
    public static void main(String[] args){
       String a="ram";
       String b="ram";
       String c= new String("hari");
       String d= new String("hari");
       System.out.println(a==b);
       System.out.println(c==d);
       System.out.println(c.equals(d));
       System.out.println(a.equals(b));
       System.out.println(c.concat("Shyam"));
       c=c.concat("Shyam");
       System.out.println(c);
       StringBuilder s1=new StringBuilder("sita");
       System.out.println(s1);
       s1.append("ram");
       System.out.println(s1);
    }
}
