/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myproject.classmodelling;

/**
 *
 * @author SHIVALI
 */
public class Bookcatelogue {
    
private  String title;
private  String author;
private int publicationDate;
private String [] genres;
private boolean checkedOut;
private int dueDate;
private int fine;

    public Bookcatelogue(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Bookcatelogue(int publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public int getFine() {
        return fine;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }


}
