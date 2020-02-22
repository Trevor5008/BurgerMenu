package com.company;

public class DeluxeBurger extends Hamburger {
    private boolean chips;
    private boolean drink;

    public DeluxeBurger() {
        super("Sourdough", "Fillet Mignon");
        this.setName("Deluxe");
    }

    public void setChips(boolean chips) {
        this.chips = chips;
        addTopping();
    }

    public void setDrink(boolean drink) {
        this.drink = drink;
        addTopping();
    }
}
