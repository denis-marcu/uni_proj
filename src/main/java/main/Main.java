package main;

import main.decorator.*;

public class Main {
    public static void main(String[] args) {
        //Here I implemented the decorator.
        Coffee c1 = new CoffeeImpl();
        Coffee c2 = new Macchiato(new CoffeeImpl());
        Coffee c3 = new Espresso(new CoffeeImpl());

        System.out.println(c1.description() + "\n" +"price:" + c1.price());
        System.out.println(c2.description() + "\n" +"price:" + c3.price());
        System.out.println(c3.description() + "\n" +"price:" + c2.price());
    }





}
