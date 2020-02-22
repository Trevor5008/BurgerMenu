package com.company;

public class Main {

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Kaiser", "Steak");
        hamburger.addLettuce();
        hamburger.addMushrooms();
        //hamburger.addTomato();
        System.out.println("Your total for one "+hamburger.getName()+ " burger, will be: $"+hamburger.getTotal());
        HealthyBurger healthy = new HealthyBurger();
        System.out.println(healthy.getName());
        System.out.println("The total for one "+healthy.getName()+ " burger, is: $"+healthy.getTotal());
        DeluxeBurger dlux = new DeluxeBurger();
        System.out.println("One "+dlux.getName()+", on "+dlux.getRollType());
        System.out.println("The "+dlux.getName()+" has "+dlux.getMeat()+"...is that ok?");
    }
}
