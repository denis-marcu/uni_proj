package main.decorator;

public class Macchiato extends CoffeeDecorator{

    public Macchiato(Coffee coffee){
        super(coffee);
    }

    public String description(){
        return super.description() + getMacchiato();
    }

    @Override
    public double price() {
        return super.price() + 2.0;
    }

    private String getMacchiato(){
        return " with a little bit of milk.(Macchiato)";
    }
}
