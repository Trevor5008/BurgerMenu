package com.company;

public class Hamburger {
    private String name;
    private String rollType;
    private String meat;
    private boolean lettuce;
    private boolean tomato;
    private boolean mushrooms;
    private boolean onion;
    protected int toppingCount = 0;
    protected double basePrice = 6.0D;
    protected double toppingsPrice = 1.25D;
    protected double totalPrice;

    public Hamburger(String rollType, String meat) {
        this.totalPrice = this.basePrice;
        this.rollType = rollType;
        this.meat = meat;
        this.setName("Original");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasePrice(double price) {
        this.basePrice = price;
    }

    public void addLettuce() {
        this.lettuce = true;
        addTopping();
    }

    public void addTomato() {
        this.tomato = true;
        addTopping();
    }

    public void addMushrooms() {
        this.mushrooms = true;
        addTopping();
    }

    public void addOnion() {
        this.onion = true;
        addTopping();
    }

    public void addTopping() {
        toppingCount++;
        totalPrice+=toppingsPrice;
    }
    public void setRollType(String rollType) {
        this.rollType = rollType;
    }

    public double getTotal() {
        return this.totalPrice;
    }

    public String getRollType() {
        return this.rollType;
    }

    public String getMeat() {
        return this.meat;
    }
}
