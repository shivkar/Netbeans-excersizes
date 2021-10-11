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
public class Cargame {
     private String make;
    private String model;
    private double velocity, acceleration ,maxspeed, maxaccelaration;

    public Cargame(String make, String model, double velocity, double acceleration, double maxspeed, double maxaccelaration) {
        this.make = make;
        this.model = model;
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.maxspeed = maxspeed;
        this.maxaccelaration = maxaccelaration;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public double getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(double maxspeed) {
        this.maxspeed = maxspeed;
    }

    public double getMaxaccelaration() {
        return maxaccelaration;
    }

    public void setMaxaccelaration(double maxaccelaration) {
        this.maxaccelaration = maxaccelaration;
    }
    
}
