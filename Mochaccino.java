package Factory;

public class Mochaccino implements Coffee{
    @Override
    public void grindCoffee(){
        System.out.println("Grinding the coffee for the Mocha...");
    }
    @Override
    public void makeCoffee(){
        System.out.println("Making the Mocha...");
    }
    @Override
    public void pourIntoCup(){
        System.out.println("Done! Pouring the mocha into a cup...");
    }
}
