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
public class Airplaneflightsim {
     private int  passengers ;
    private String name ;
    private String model;
    private double longitude, latitude ,altitute , pitch, yaw; 
    private double fuelleft , damagetaken;
    private double [] headingvecor;

   
    

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

    public double getPitch() {
        return pitch;
    }

    public void setPitch(double pitch) {
        this.pitch = pitch;
    }

    public double getYaw() {
        return yaw;
    }

    public void setYaw(double yaw) {
        this.yaw = yaw;
    }

    public double getFuelleft() {
        return fuelleft;
    }

    public void setFuelleft(double fuelleft) {
        this.fuelleft = fuelleft;
    }

    public double getDamagetaken() {
        return damagetaken;
    }

    public void setDamagetaken(double damagetaken) {
        this.damagetaken = damagetaken;
    }

    public double[] getHeadingvecor() {
        return headingvecor;
    }

    public void setHeadingvecor(double[] headingvecor) {
        this.headingvecor = headingvecor;
    }
    
}
