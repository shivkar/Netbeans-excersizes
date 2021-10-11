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
public class house3D {
    //class attributes 
    private String title ;
    private String designer;
    private double xCord, yCord, zCord;
    
    
   private Object [] models;  // The design is collection of 3d objects 

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesigner() {
        return designer;
    }

    public void setDesigner(String designer) {
        this.designer = designer;
    }

    public double getxCord() {
        return xCord;
    }

    public void setxCord(double xCord) {
        this.xCord = xCord;
    }

    public double getyCord() {
        return yCord;
    }

    public void setyCord(double yCord) {
        this.yCord = yCord;
    }

    public double getzCord() {
        return zCord;
    }

    public void setzCord(double zCord) {
        this.zCord = zCord;
    }

    public Object[] getModels() {
        return models;
    }

    public void setModels(Object[] models) {
        this.models = models;
    }
     
    //class constructor 
    public house3D(String title, String designer){
         this.title = title;
         this.designer = designer;
        
     }
}

