package com.company;

public class HealthyBurger extends Hamburger {
    private boolean sprouts;
    private boolean turmeric;

    public HealthyBurger() {
        super("Brown Rye bread roll", "Tofu");
        this.setName("HealthFreak");
    }

    public void addSprouts() {
        this.sprouts = true;
        addTopping();
    }

    public void setTurmeric() {
        this.turmeric = true;
        addTopping();
    }
}