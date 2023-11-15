package Factory;

public class Main {
    public static void main(String[] args) throws Exception {
        Coffee coffee = CoffeeFactory.makeCoffeeByType("Moka");

        if(coffee == null){
            throw new Exception("The machine doesn't have this coffee!");
        }

        coffee.grindCoffee();
        coffee.makeCoffee();
        coffee.pourIntoCup();
    }
}
