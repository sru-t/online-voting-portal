/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info;

import java.util.ArrayList;

/**
 *
 * @author windows10
 */
public class B {
       ArrayList name=new ArrayList();
       //ArrayList<String> studentName=new ArrayList();
    public static void main(String[] args){
        B b=new B();
        ArrayList<String> studentName=new ArrayList();
        b.name.add("rashmi");
        b.name.add("manisha");
       // name.add("Abdhesh");
        studentName.add("Rashmi");
        studentName.add("Ranju");
        studentName.add("Bibhor");
        for(Object n:b.name){
          System.out.println(n);
        }
        for(String n:studentName){
          System.out.println(n);
        }
    }  
}
