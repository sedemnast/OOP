package HW2.task1;

public class Main {
    public static void main(String[] args) {

    Human human1 = new Human("Nataly", 23, "Russia");

    System.out.println(human1);
    human1.setMakeOrder();
    System.out.println(human1);
    human1.setTakeOrder();
    System.out.println(human1);

    }
}
