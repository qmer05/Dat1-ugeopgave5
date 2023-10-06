package task2;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe(); // Create an instance of the Cafe class
        cafe.loadMenuData();    // Call the loadMenuData() method
        //hvis lavet som for each pga lavet i en method
        //displayMenu(cafe);

         for (int i = 0; i < cafe.getCoffeeMenu().size(); i++) {
            String menuItem = cafe.getCoffeeMenu().get(i);
            System.out.println(menuItem);
            // alternativt:
            // System.out.println(cafe.getCoffeeMenu().get(i));
        }
    }
}

    /* lave i stedet som en for each:

    public static void displayMenu(Cafe cafe){
        for (String menuItem : cafe.getCoffeeMenu()) {
            System.out.println(menuItem);
        }
     */