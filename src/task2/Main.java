package task2;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe(); // Create an instance of the Cafe class
        cafe.loadMenuData();    // Call the loadMenuData() method
        for (int i = 0; i < cafe.coffeeMenu.size(); i++) {
          //  System.out.println(cafe.coffeeMenu.get(i));
        }
    }
}
