package Factory;

public class Dark_Coffee implements Coffee{
    @Override
    public void grindCoffee(){
        System.out.println("Grinding the coffee for the dark coffee...");
    }
    @Override
    public void makeCoffee(){
        System.out.println("Making the dark coffee...");
    }
    @Override
    public void pourIntoCup(){
        System.out.println("Done! Pouring the dark coffee into a cup...");
    }
}
