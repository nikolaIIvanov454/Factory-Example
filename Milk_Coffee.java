package Factory;

public class Milk_Coffee implements Coffee{
    @Override
    public void grindCoffee(){
        System.out.println("Grinding the coffee for the milk coffee...");
    }
    @Override
    public void makeCoffee(){
        System.out.println("Making the milk coffee...");
    }
    @Override
    public void pourIntoCup(){
        System.out.println("Done! Pouring the milk coffee into a cup...");
    }
}
