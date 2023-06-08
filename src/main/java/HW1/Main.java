package HW1;

public class Main {
    public static void main(String[] args) {
        HotDrink coffee = new HotDrink("Coffee", 250, 50);
        HotDrink tea = new HotDrink("Tea", 250, 50);

        HotDrinksMachine vendingMachine = new HotDrinksMachine();
        vendingMachine.addDrink(coffee);
        vendingMachine.addDrink(tea);

        System.out.println(vendingMachine.getProduct("Tea", 250, 50));
        System.out.println(vendingMachine.getProduct(50).toString());
    }
}