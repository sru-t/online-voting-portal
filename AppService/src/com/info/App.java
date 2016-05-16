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
public class App {
    public static void main(String[] args){
        AppService as=new AppService();
        Animal a = new Lion();
        String animal =as.getAnimal(a); // or animal=as.getAnimal(new Lion());
        System.out.println(animal);
        
    
    }
    
}
