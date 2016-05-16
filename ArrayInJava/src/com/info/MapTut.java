/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info;

import java.util.HashMap;
import java.util.Set;

/**
 *
 * @author windows10
 */
public class MapTut {
    
   public static void main(String[] args){
     HashMap<String,String> m= new HashMap();
     m.put("a","Ram");
     m.put("b", "Hari");
     System.out.println(m.get("b"));
     Set<String> key=m.keySet();
     for(String k:key){
         System.out.println(k+"...."+m.get(k));
     }
   } 
}
