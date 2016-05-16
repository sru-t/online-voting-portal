/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author windows10
 */
public class F {
  public static void main(String[] args){
     String p1="[a-zA-Z0-9_]+(\\.[a-zA-Z0-9_]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})?";
      Pattern p=Pattern.compile(p1);
      Matcher m=p.matcher("tiwarirashmi042@gmail.con");
      System.out.println(m.matches());
  }   
}
