/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.adm;
import com.info.employ;
/**
 *
 * @author windows10
 */
public class account {
     public int income;
     public int bonus;
     public static int bonus(int i){
      int b=(i*5)/100;
     return b;
     }
    public int inc(){
      employ e = new employ();
      account a = new account();
      int w=e.getWorkingHour();
      a.income=w * 150 *30;
      
      // e.setSalary(12);
      
       
      return bonus(a.income)+a.income;
      //System.out.println(e.salary);
     
    
    }    
    
}
