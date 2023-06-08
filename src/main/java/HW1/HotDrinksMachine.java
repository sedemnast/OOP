package HW1;

import java.util.ArrayList;
import java.util.List;

public class HotDrinksMachine implements VendingMachine {
    private final List<HotDrink> drinks;

    public HotDrinksMachine() {
        drinks = new ArrayList<>();
    }

    @Override
    public void addDrink(HotDrink drink) {
        drinks.add(drink);
    }

    @Override
    public HotDrink getProduct(String type, int volume, int temperature) {
        for (HotDrink drink : drinks) {
            if (type.equals(drink.getType()) && volume == drink.getVolume() && temperature == drink.getTemperature()) {
                return drink;
            }
        }
        return null;
    }

    public HotDrink getProduct(String type) {
        for (HotDrink drink : drinks) {
            if (type.equals(drink.getType())) {
                return drink;
            }
        }
        return null;
    }

    public HotDrink getProduct(int temperature) {
        for (HotDrink drink : drinks) {
            if (temperature == drink.getTemperature()) {
                return drink;
            }
        }
        return null;
    }
}