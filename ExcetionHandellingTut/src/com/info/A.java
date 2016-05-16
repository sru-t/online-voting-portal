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
         try{
         System.out.println("A");
         int i=1/0;
         System.out.println("B");
         }catch(ArithmeticException e){
          System.out.println("R");   
         }catch(NullPointerException e){
           System.out.println("c");
         }finally{
            System.out.println("M");
         }
         System.out.println("D");
    }
}
