/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author windows10
 */
public class D {
    
    public static void main(String[] args){
        File f = new File("a.txt");
        
        try{
            f.createNewFile();
        }catch(IOException ex){
                        
        }
    }
}
