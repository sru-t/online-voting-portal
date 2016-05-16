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
public class A {
    public static void main(String[] args){
        
        String[] n = new String[3];
        n[0] = "Ram";
        n[1] = "Rashmi";
        n[2] = "Shyam";
        
        for(int i=0;i<n.length;i++){
          System.out.println(n[i]);
        }
        for(String name:n){
             System.out.println(name);
        }
    }
}
