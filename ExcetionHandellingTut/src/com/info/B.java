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
public class B {
    
    public static void main(String[] args){
        try{
          System.out.println("A----->>>>>>>>");
          int i=9;
          int j=0;
          if(j==0){
          throw new ArithmeticException();
          //System.out.println("B------>>>>>>>");
          }else {
             int k =i/j;
          }
        }catch(Exception e){
         System.out.println("B---->>>");
         
        }
        System.out.println("D----->>>>>>");
    }
}
