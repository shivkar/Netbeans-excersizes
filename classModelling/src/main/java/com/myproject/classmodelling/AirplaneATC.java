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
public class AirplaneATC {
    private int  passengers ;
    private String name ;
    private String model;
    private double longitude, latitude ,altitute ; 
    private double fuelleft;
    private double [] headingvecor; // 6 values -direction and velocity in x,,z
    AirplaneATC (String name, String model){
        this.name= name;
        this.model= model;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getAltitute() {
        return altitute;
    }

    public void setAltitute(double altitute) {
        this.altitute = altitute;
    }

    public double getFuelleft() {
        return fuelleft;
    }

    public void setFuelleft(double fuelleft) {
        this.fuelleft = fuelleft;
    }

    public double[] getHeadingvecor() {
        return headingvecor;
    }

    public void setHeadingvecor(double[] headingvecor) {
        this.headingvecor = headingvecor;
    }
    
    }
    

