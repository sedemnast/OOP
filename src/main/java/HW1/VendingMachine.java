package HW1;

public interface VendingMachine {
    void addDrink(HotDrink drink);

    HotDrink getProduct(String type, int volume, int temperature);
}
