package main.decorator;

public abstract class CoffeeDecorator implements Coffee {
    private Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public String description(){
        return coffee.description();
    }

    public double price(){
        return coffee.price();
    }

}
