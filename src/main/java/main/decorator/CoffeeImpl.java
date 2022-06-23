package main.decorator;

public class CoffeeImpl implements Coffee{

    public String description() {
        return "This is a coffee ";
    }

    public double price() {
        return 5.0;
    }
}
