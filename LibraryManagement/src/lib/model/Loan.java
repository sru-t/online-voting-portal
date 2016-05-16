/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.model;

/**
 *
 * @author windows10
 */
public class Loan {
    private Student student;
    private Copy copy;
    private String issuedDate;
    private String returnDate;

    public Loan(Student student, Copy copy) {
        this.student = student;
        this.copy = copy;
        this.issuedDate=Utils.getCurrentDate();
        
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Copy getCopy() {
        return copy;
    }

    public void setCopy(Copy copy) {
        this.copy = copy;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public void setIssuedDate(String issuedDate) {
        this.issuedDate = issuedDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
    
    
}
