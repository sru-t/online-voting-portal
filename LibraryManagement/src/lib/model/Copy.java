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
public class Copy {
    private static String STATUS_AVAILABLE ="Available";
    private static String STATUS_LOANED="Loaned";
    
    private String status;
    private Book book;
    private int copyNum;
    private Loan loan;

    Copy(Book book, int copyNum) {
        this.status = STATUS_AVAILABLE ;
        this.book = book;
        this.copyNum = copyNum;
    }
    public Vector getVector(){
        Vector newRow= new Vector();
        newRow.add(getCopyNum());
        newRow.add(getStatus());
        String issueDate= loan!=null?loan.getIssuedDate():"N/A";
        String returnedDate = loan!=null && loan.getReturnDate()!=null ? loan.getReturnDate():"N/A";
        String studentName = loan!=null ? loan.getStudent().getsName():"N/A";
        newRow.add(issueDate);
        newRow.add(returnedDate);
        newRow.add(studentName);
        return newRow;
    }

    
    @Override
    public String toString() {
        return  ""+copyNum ;
    }

    public void loan(Student student){
       this.loan = new Loan(student,this);
       this.status=STATUS_LOANED;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getCopyNum() {
        return copyNum;
    }

    public void setCopyNum(int copyNum) {
        this.copyNum = copyNum;
    }

    
    
    
    
    
}
