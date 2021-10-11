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
public class Icecreammachine {
    private String name;
    private double creamapplied,sugarapplied,flowrate, curnrate;
    private boolean jam, overfill, underfill;

    
    // call regular methods 
   public void updateFromSensors() {
  
}
  
public void reportError() {
  
}
  
public void startUp() {
  
}
  
public void shutDown() {
  
}

    public double getCreamapplied() {
        return creamapplied;
    }

    public void setCreamapplied(double creamapplied) {
        this.creamapplied = creamapplied;
    }

    public double getSugarapplied() {
        return sugarapplied;
    }

    public void setSugarapplied(double sugarapplied) {
        this.sugarapplied = sugarapplied;
    }

    public double getFlowrate() {
        return flowrate;
    }

    public void setFlowrate(double flowrate) {
        this.flowrate = flowrate;
    }

    public double getCurnrate() {
        return curnrate;
    }

    public void setCurnrate(double curnrate) {
        this.curnrate = curnrate;
    }

    public boolean isJam() {
        return jam;
    }

    public void setJam(boolean jam) {
        this.jam = jam;
    }

    public boolean isOverfill() {
        return overfill;
    }

    public void setOverfill(boolean overfill) {
        this.overfill = overfill;
    }

    public boolean isUnderfill() {
        return underfill;
    }

    public void setUnderfill(boolean underfill) {
        this.underfill = underfill;
    }
    
}
