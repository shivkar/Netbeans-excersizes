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
public class Carinventory {
    private String make;
    private String model;
    private String color,soundsystem ;
    private int numberInstock;
    private int cost;
    private boolean orderPlaced;
    private int orderdate;
    private int arriavaldate;

    public Carinventory(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSoundsystem() {
        return soundsystem;
    }

    public void setSoundsystem(String soundsystem) {
        this.soundsystem = soundsystem;
    }

    public int getNumberInstock() {
        return numberInstock;
    }

    public void setNumberInstock(int numberInstock) {
        this.numberInstock = numberInstock;
    }

    public boolean isOrderPlaced() {
        return orderPlaced;
    }

    public void setOrderPlaced(boolean orderPlaced) {
        this.orderPlaced = orderPlaced;
    }

    public int getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(int orderdate) {
        this.orderdate = orderdate;
    }

    public int getArriavaldate() {
        return arriavaldate;
    }

    public void setArriavaldate(int arriavaldate) {
        this.arriavaldate = arriavaldate;
    }
    
    
}
