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
public class houseGPS {

    private int houseNumber;
    private String city;
    private String state;
    private String zip;
    private final double xCord; // final double,so value can not be modified as it is non access modifier
    private final double yCord;
    private String adress;

    // class as method (behaviour),create class constructor for houseGPS class 
    public houseGPS(double x, double y) {
        this.xCord = x;
        this.yCord = y;
    }

    public String getAdress() {
        return adress;
    }

    public double[] getCords() {
        double[] arr = {this.xCord ,
        this.yCord };
    
    return arr ;
}

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
// coordiantes cannot be changed ,so it is read-only method 
    public double getXcord() {
        return xCord;
    }

    public double getYcord() {
        return yCord;
    }

  
   }
            
    

