package Factory;

public class CoffeeFactory {
    protected static Coffee makeCoffeeByType(String type) {
        switch (type) {
            case "Moka":
                return new Mochaccino();
            case "Dark_Coffee":
                return new Dark_Coffee();
            case "Milk_Coffee":
                return new Milk_Coffee();
            default:
                return null;
        }
    }
}
