/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author windows10
 * Book is a class to represent the data model of book related info
 */
public class Book {
   private String name;//title
   private String publication ;
   private String author;
   private int numCopy;// number of copies of the book
   private String caseNum;
   private int isbn;
   private List<Copy> copies = new ArrayList();
   

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public Book(String name, String publication, String author, int numCopy, String caseNum,int isbn) {
        this.name = name;
        this.publication = publication;
        this.author = author;
        this.numCopy = numCopy;
        this.caseNum = caseNum;
        this.isbn=isbn;
    }

    @Override
    public String toString() {
        return name;
    }

    
     public Vector getVector(){
        Vector newRow = new Vector();
        newRow.add(getIsbn());
        newRow.add(getName());
        newRow.add(getPublication());
        newRow.add(getAuthor());
        newRow.add(getNumCopy());
        newRow.add(getCaseNum());
        
        return newRow;
        
    }
   
     public void addCopy(int copyNum){
         copies.add(new Copy(this, copyNum));
     }
     
     public List<Copy> getCopies(){
         return copies;
     }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublication() {
        return publication;
    }

    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumCopy() {
        return numCopy;
    }

    public void setNumCopy(int numCopy) {
        this.numCopy = numCopy;
    }

    public String getCaseNum() {
        return caseNum;
    }

    public void setCaseNum(String caseNum) {
        this.caseNum = caseNum;
    }
   
    
}
