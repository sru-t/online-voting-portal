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
public class Gc {
    public String name;
    public static void main(String[] args){
        Gc g1 = new Gc();
        Gc g2 = new Gc();
        Gc g3 = new Gc();
        g1.name="rashmi";
        g1=g2;
        
        System.out.println(g1.name);
        System.out.println(g2.name);
    }
    
}
