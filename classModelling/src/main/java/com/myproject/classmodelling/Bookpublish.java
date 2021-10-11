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
public class Bookpublish {
private String title, author;
private String [] textByChapter;
private int lastSubmissionDate, deadline; 

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getTextByChapter() {
        return textByChapter;
    }

    public void setTextByChapter(String[] textByChapter) {
        this.textByChapter = textByChapter;
    }

    public int getLastSubmissionDate() {
        return lastSubmissionDate;
    }

    public void setLastSubmissionDate(int lastSubmissionDate) {
        this.lastSubmissionDate = lastSubmissionDate;
    }

    public int getDeadline() {
        return deadline;
    }

    public void setDeadline(int deadline) {
        this.deadline = deadline;
    }


}
