/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.stosh;

/**
 *
 * @author Lenovo G40
 */
public class Calculate {
    
    public int add(int a, int b){
        int result =  a+b+10;
        return result;
    }
    
     public void sub(int a, int b){
        int result =  a-b;
    }
    
    public static void main(String[] ar){
        Calculate c = new Calculate();
        
        int result = c.add(5, 6);
        
         result = c.add(5, 6);
        
        System.out.println(result);
    }
    
}
