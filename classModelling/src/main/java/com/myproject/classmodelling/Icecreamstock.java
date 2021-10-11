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
public class Icecreamstock {
private  String name;
private double cost;
private int stockLevel;
private boolean timeToReorder;
private boolean reorderIncoming;
private int reorderDue;

    public Icecreamstock(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getStockLevel() {
        return stockLevel;
    }

    public void setStockLevel(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public boolean isTimeToReorder() {
        return timeToReorder;
    }

    public void setTimeToReorder(boolean timeToReorder) {
        this.timeToReorder = timeToReorder;
    }

    public boolean isReorderIncoming() {
        return reorderIncoming;
    }

    public void setReorderIncoming(boolean reorderIncoming) {
        this.reorderIncoming = reorderIncoming;
    }

    public int getReorderDue() {
        return reorderDue;
    }

    public void setReorderDue(int reorderDue) {
        this.reorderDue = reorderDue;
    }


}
