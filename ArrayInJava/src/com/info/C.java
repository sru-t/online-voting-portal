/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author windows10
 */
public class C {
    public static void main(String[] args){
        HashSet<String> s=new HashSet();
        s.add("rash");
        s.add("ram");
        s.add("rashmi");
        System.out.println(s.size());
        for(String s1:s){
          System.out.println(s1);
        }
        Iterator iterator=s.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
            System.out.println("A--------->>>");
        }
    }
    
}
