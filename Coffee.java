package Factory;

public interface Coffee {
    default void grindCoffee(){
        System.out.println("Grinding the coffee...");
    }
    default void makeCoffee(){
        System.out.println("Making the coffee...");
    }
    default void pourIntoCup(){
        System.out.println("Done! Pouring into a cup...");
    }
}
