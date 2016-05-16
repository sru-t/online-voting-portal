/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.info;
import com.adm.account;
/**
 *
 * @author windows10
 */
public class employ {
    public String name;
    protected String address;
    protected String email;
    private int salary;
    private int workingHour=6;
     
   

    
    public static void main(String[] args){
       employ e = new employ();
       account a = new account();
       e.name="Rashmi Tiwari";
       e.address="Janakpur";
       e.email="tiwarirashmi042@gmail.com";
       e.setSalary(a.inc());
       System.out.println("Name= "+e.name);
       System.out.println("Address= "+e.address);
       System.out.println("Email= "+e.email);
       System.out.println("Salary= "+e.getSalary());
    }

    
    public int getWorkingHour() {
        return workingHour;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @param workingHour the workingHour to set
     */
//    public void setWorkingHour(int workingHour) {
//        this.workingHour = workingHour;
//    }

    
    
}
