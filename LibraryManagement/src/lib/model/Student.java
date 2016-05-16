/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.model;

import java.util.Vector;

/**
 *
 * @author windows10
 */
public class Student {
    
     private String sName;//title
     private String rollNo ;
     private String program;
     private String year;

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

   
   public Vector getVector(){
        Vector newRow = new Vector();
        newRow.add(getsName());
        newRow.add(getRollNo());
        newRow.add(getProgram());
        newRow.add(getYear());
        return newRow;
        
    }
   
    public Student(String sName, String rollNo, String program,String year) {
        this.sName = sName;
        this.rollNo = rollNo;
        this.program = program;
        this.year = year;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    
}
