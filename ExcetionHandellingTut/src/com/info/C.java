/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info;

import java.io.IOException;

/**
 *
 * @author windows10
 */
public class C {
    
    public void abc()throws IOException{
        System.out.println("C------>>>>>");
        throw new IOException();
        
    }
    
    public void xyz()throws IOException{
        System.out.println("B----->>>>");
      
        abc();
        System.out.println("D----->>>>>");
    }
     
    public static void main(String[] args){
    
        C c=new C();
        
        System.out.println("A---->>>");
        try{
        c.abc();
        }catch(Exception e){
           e.printStackTrace();     
        }
        System.out.println("E------>>>>");
    }
}
