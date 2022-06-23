package main.decorator;

public class Espresso extends CoffeeDecorator{

    public Espresso(Coffee coffee){
        super(coffee);
    }

    public String description(){
        return super.description() + getEspresso();
    }

    @Override
    public double price() {
        return super.price() + 1.0;
    }

    private String getEspresso(){
        return " with an intense taste.(Espresso)";
    }


}
